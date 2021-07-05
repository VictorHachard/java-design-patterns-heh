package be.isims.ihm.tp4bis.ex2;

import java.awt.*;

public class DrawCanvas extends Canvas {

    private Color color;
    private int redValue;
    private int greenValue;
    private int blueValue;

    public DrawCanvas() {
        setSize(350, 350);
        color = new Color(0, 0, 0);
        setBackgroundColor();
    }

    public void setBackgroundColor() {
        color = new Color(redValue, greenValue, blueValue);
        setBackground(color);
    }

    public Color getColor() {
        return color;
    }

    public void setRedValue(int redValue) {
        this.redValue = redValue;
    }

    public void setGreenValue(int greenValue) {
        this.greenValue = greenValue;
    }

    public void setBlueValue(int blueValue) {
        this.blueValue = blueValue;
    }

}
