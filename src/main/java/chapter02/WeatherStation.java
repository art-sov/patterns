package chapter02;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(20, 60, 76);
        weatherData.setMeasurements(22, 44, 75);
        weatherData.setMeasurements(19, 50, 77);
    }


}
