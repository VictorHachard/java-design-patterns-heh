package be.isims.ihm.tp4bis.ex1;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        getContentPane().add(new ConverterFrm());
        setSize(500,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
