public class WeatherReport {
    public void displayWeather(WeatherData WeatherData) {
        System.out.println("Temperature" + WeatherData.getTemperature() + "°C");
        System.out.println("humidity" + WeatherData.getHumidity() + "%");
        System.out.println("weatherCondition" + WeatherData.getWeatherCondition());
    }
}




