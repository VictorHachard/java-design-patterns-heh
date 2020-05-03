package be.isims.ihm.tp4bis.ex3;

import be.isims.ihm.tp4bis.ex3.observer.Observer;

import javax.swing.*;
import java.awt.*;

public class TemperatureView extends JPanel implements Observer {

    private Model model;
    private JPanel panel;
    private Label temperature;

    public TemperatureView(Model model) {
        this.model = model;
        panel = new JPanel();
        temperature = new Label(Double.toString(model.getTemperature()));
        panel.add(temperature);
        add(panel);
    }

    @Override
    public void update(Object o) {
        temperature.setText(Double.toString(model.getTemperature()));
    }

}
