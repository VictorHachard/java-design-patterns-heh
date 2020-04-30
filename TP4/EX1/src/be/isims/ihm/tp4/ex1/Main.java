package be.isims.ihm.tp4.ex1;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,500);

        BankAccount cb = new BankAccount(100.0);
        JPanel panel = cb.getBankAccountFrm().getPanel();
        JTextArea textArea = cb.getBankAccountFrm().getTextArea();

        f.getContentPane().add(BorderLayout.NORTH, panel);
        JScrollPane scroll = new JScrollPane(textArea);
        f.getContentPane().add(BorderLayout.CENTER, scroll);

        f.setVisible(true);
    }

}
