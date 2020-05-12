package be.isims.ihm.tp4bis.ex3;

import be.isims.ihm.tp4bis.ex3.observer.Observable;

public class Model extends Observable {

    private double temperature;

    public Model() {
        this.temperature = 18;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.notifyAllObservers();
    }

}
