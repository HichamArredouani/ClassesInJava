public class WeatherData {
    private double temperature;
    private double humidity;
    private String weathercondition;

    public WeatherData(double temperature, double humidity, String weathercondition) {
        this.temperature =  temperature;
        this.humidity = humidity;
        this.weathercondition = weathercondition;
    }
    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getWeatherCondition() {
        return weathercondition;
    }
}
