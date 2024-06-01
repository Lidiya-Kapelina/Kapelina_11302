import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

class DownloadTask implements Runnable {
    private final String url;
    private final String filePath;
    private long downloadedBytes;
    private long totalBytes;
    private volatile boolean isRunning;

    public DownloadTask(String url, String filePath) {
        this.url = url;
        this.filePath = filePath;
        this.downloadedBytes = 0;
        this.totalBytes = -1;
        this.isRunning = true;
    }

    public double getProgress() {
        if (totalBytes == -1) {
            return 0;
        }
        if (downloadedBytes == totalBytes) {
            return 100;
        }
        return (double) downloadedBytes / totalBytes * 100;
    }

    @Override
    public void run() {
        try {
            URL downloadUrl = new URL(url);
            URLConnection connection = downloadUrl.openConnection();
            totalBytes = connection.getContentLengthLong();
            try (BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
                 FileOutputStream out = new FileOutputStream(filePath)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1 && isRunning) {
                    out.write(buffer, 0, bytesRead);
                    downloadedBytes += bytesRead;
                    System.out.println("Загрузка: " + getProgress() + "%");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка загрузки" );
        } finally {
            isRunning = false;
        }
    }
}
