public class Main1 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(6,7,8);
    }
}
