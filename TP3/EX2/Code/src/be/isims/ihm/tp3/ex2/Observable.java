package be.isims.ihm.tp3.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Observable {

    private List<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    public void addObserver(Observer... observers) {
        this.observers.addAll(Arrays.asList(observers));
    }

    public void removeObserver(Observer... observers) {
        this.observers.removeAll(Arrays.asList(observers));
    }

}
