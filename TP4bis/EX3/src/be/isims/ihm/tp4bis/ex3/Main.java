package be.isims.ihm.tp4bis.ex3;

import javax.swing.*;

public class Main {

    public Main() {
        Model model = new Model();
        TemperatureView temperatureView = new TemperatureView(model);
        model.addObserver(temperatureView);
        JFrame TemperatureModelViewFrame = new JFrame();
        TemperatureModelViewFrame.setSize(300, 300);
        TemperatureModelViewFrame.getContentPane().add(temperatureView);
        TemperatureModelViewFrame.setVisible(true);
        JFrame TemperatureViewFrame = new JFrame();
        TemperatureViewFrame.setSize(300, 300);
        TemperatureViewFrame.getContentPane().add(new TemperatureModelView(model));
        TemperatureViewFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
