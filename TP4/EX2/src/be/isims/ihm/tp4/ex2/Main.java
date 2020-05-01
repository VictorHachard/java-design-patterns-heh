package be.isims.ihm.tp4.ex2;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        getContentPane().add(new BankAccount());
        setSize(400,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
