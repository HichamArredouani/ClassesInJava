public class MainJava {
    public static void main(String[] args) {
        WeatherData today = new WeatherData(22.5, 60, "Sunny");
        WeatherData tomorrow = new WeatherData(18.3, 45, "Rainy");

        WeatherReport report = new WeatherReport();

        report.displayWeather(today);
        report.displayWeather(tomorrow);
    }
}
