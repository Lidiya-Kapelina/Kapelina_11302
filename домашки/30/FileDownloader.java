import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileDownloader {

    private static final int MAX_THREADS = 8;
    private static final Map<String, DownloadThread> downloadThreads = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File downloadsFolder = new File("downloads");
        if (!downloadsFolder.exists()) {
            downloadsFolder.mkdir();
        }

        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            if (parts[0].equalsIgnoreCase("download")) {
                if (parts.length != 2) {
                    System.out.println("Неправильный формат команды. Использование: download <адрес>");
                } else {
                    String url = parts[1];
                    String filePath = "downloads/" + extractFileNameFromUrl(url);
                    DownloadThread thread = new DownloadThread(url, filePath);
                    thread.start();
                    downloadThreads.put(filePath, thread);
                }
            } else if (parts[0].equalsIgnoreCase("status")) {
                if (parts.length != 2) {
                    System.out.println("Неправильный формат команды. Использование: status <адрес>");
                } else {
                    String url = parts[1];
                    String fileName = extractFileNameFromUrl(url);
                    String filePath = "downloads/" + fileName;
                    DownloadThread thread = downloadThreads.get(filePath);
                    if (thread != null) {
                        System.out.println("Прогресс загрузки: " + thread.getProgress() + "%");
                    } else {
                        System.out.println("Файл не найден.");
                    }
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Выход...");
                break;
            } else {
                System.out.println("Неизвестная команда. Доступные команды: download, status, exit.");
            }
        }
    }
    private static String extractFileNameFromUrl(String url) {
        String fileName = url.substring(url.lastIndexOf('/') + 1);
        return fileName;
    }
}
