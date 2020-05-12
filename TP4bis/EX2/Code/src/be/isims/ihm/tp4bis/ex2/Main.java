package be.isims.ihm.tp4bis.ex2;

import javax.swing.*;

/**
 * http://www.java2s.com/Tutorial/Java/0240__Swing/UseSlidertocontrolthecolorRGBvalue.htm
 */
public class Main extends JFrame {

    public Main() {
        getContentPane().add(new SliderColor());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
