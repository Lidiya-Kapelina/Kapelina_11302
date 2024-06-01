import org.json.JSONObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Weather {
    static final String API_KEY = "424794e032a558b048b1f4f4c484fdab";

    public static void main(String[] args) {
        String[] cities = {"London", "New York", "Tokyo", "Paris", "Moscow", "Sydney", "Dubai"};

        for (String city : cities) {
            try {
                URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + API_KEY);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                StringBuilder response = new StringBuilder();
                Scanner scanner = new Scanner(connection.getInputStream());
                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }
                scanner.close();
                JSONObject jsonObject = new JSONObject(response.toString());
                String cityName = jsonObject.getString("name");
                int visibility = jsonObject.getInt("visibility");
                JSONObject main = jsonObject.getJSONObject("main");
                double temperature = main.getDouble("temp");
                int date = jsonObject.getInt("dt");
                System.out.println("City: " + cityName);
                System.out.println("Temperature: " + temperature);
                writeData(cityName, temperature, date, visibility);
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }
    static void writeData(String city, double temperature, int date, int visibility) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("weather_data.csv", true));
            writer.write(city + "," + temperature + "," + date + "," + visibility + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
