package be.isims.ihm.tp4bis.ex3;

import javax.swing.*;
import java.awt.*;

public class TemperatureModelView extends JPanel {

    private Model model;
    private JPanel panel;
    private JLabel label;
    private JButton upButton;
    private JButton downButton;

    public TemperatureModelView(Model model) {
        this.model = model;
        panel = new JPanel();
        label = new JLabel();
        label.setText(Double.toString(model.getTemperature()));
        upButton = new JButton("Raise");
        downButton = new JButton("Lower");
        Controller controller = new Controller(this);
        upButton.addActionListener(controller);
        downButton.addActionListener(controller);
        panel.add(label);
        panel.add(upButton);
        panel.add(downButton);
        add(panel);
    }

    public Model getModel() {
        return model;
    }

    public void setTextLabel(String str) {
        this.label.setText(str);
    }

}
