package be.isims.ihm.tp4bis.ex2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener {

    private SliderColor sliderColor;

    public SliderListener(SliderColor sliderColor) {
        this.sliderColor = sliderColor;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JSlider slider = (JSlider)changeEvent.getSource();

        if (slider == sliderColor.getSliderR()) {
            sliderColor.getCanvas().setRedValue(slider.getValue());
            displayRGBColor();
        } else if (slider == sliderColor.getSliderG()) {
            sliderColor.getCanvas().setGreenValue(slider.getValue());
            displayRGBColor();
        } else if (slider == sliderColor.getSliderB()) {
            sliderColor.getCanvas().setBlueValue(slider.getValue());
            displayRGBColor();
        }
        sliderColor.getCanvas().repaint();
    }

    public void displayRGBColor() {
        sliderColor.getCanvas().setBackgroundColor();
        sliderColor.getRgbValue().setText(Integer.toString(sliderColor.getCanvas().getColor().getRGB() & 0xffffff, 16));
    }

}
