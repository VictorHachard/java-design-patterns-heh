package be.isims.ihm.tp4.ex3;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        getContentPane().add(new Calculator());
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
