package be.isims.ihm.tp4bis.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private TemperatureModelView temperatureModelView;

    public Controller(TemperatureModelView temperatureModelView) {
        this.temperatureModelView = temperatureModelView;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String buttonText = ((JButton) actionEvent.getSource()).getText();
        if (buttonText.equals("Raise"))
            temperatureModelView.getModel().setTemperature(temperatureModelView.getModel().getTemperature() + 1);
        else if (buttonText.equals("Lower"))
            temperatureModelView.getModel().setTemperature(temperatureModelView.getModel().getTemperature() - 1);
        temperatureModelView.setTextLabel(Double.toString(temperatureModelView.getModel().getTemperature()));
    }

}
