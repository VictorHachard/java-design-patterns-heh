package be.isims.ihm.tp3.ex2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Observable {

    private int temperature;
    private List<Integer> temperatures;
    private int humidity;

    public WeatherStation() {
        this.temperatures = new ArrayList<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.temperatures.add(temperature);
        super.notifyAllObservers();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        super.notifyAllObservers();
    }

    public List<Integer> getTemperatures() {
        return temperatures;
    }

    public void setTemperatureHumidity(int temperature, int humidity) {
        this.temperature = temperature;
        this.temperatures.add(temperature);
        this.humidity = humidity;
        super.notifyAllObservers();
    }

}
