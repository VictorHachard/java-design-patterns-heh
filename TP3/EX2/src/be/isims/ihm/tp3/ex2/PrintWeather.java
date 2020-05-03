package be.isims.ihm.tp3.ex2;

public class PrintWeather implements Observer {

    @Override
    public void update(Object o) {
        System.out.println("WeatherStation: " +
                "temperature: " + ((WeatherStation)o).getTemperature() +
                ", humidity: " + ((WeatherStation)o).getHumidity());
    }

}
