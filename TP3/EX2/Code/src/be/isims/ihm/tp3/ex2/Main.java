package be.isims.ihm.tp3.ex2;

public class Main {

    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();

        ws.addObserver(new PrintWeather(), new PrintWeatherStatistics());

        ws.setTemperatureHumidity(20, 50);
        ws.setTemperatureHumidity(25, 65);
        ws.setTemperatureHumidity(27, 70);
    }
}
