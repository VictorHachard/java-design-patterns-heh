package be.isims.ihm.tp4.ex2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BankAccount extends JPanel {

    private CurrentAccount currentAccount;
    private SavingsAccount savingsAccount;

    private JTextField textField;
    private JTextArea textArea;
    private JComboBox comboBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup buttonGroup;

    public BankAccount() {
        this.currentAccount = new CurrentAccount();
        this.savingsAccount = new SavingsAccount();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 15, 10));

        panel.add(new JLabel("Montant:"));
        textField = new JTextField();
        panel.add(textField);
        panel.add(new JLabel("Account:"));
        String items[] = {"Current Account", "Savings Account"};
        comboBox = new JComboBox(items);
        panel.add(comboBox);

        buttonGroup = new ButtonGroup();
        JPanel radios = new JPanel();

        radioButton1 = new JRadioButton();
        radioButton1.setText("Add");
        buttonGroup.add(radioButton1);
        radios.add(radioButton1);
        radioButton2 = new JRadioButton();
        radioButton2.setText("Remove");
        buttonGroup.add(radioButton2);
        radios.add(radioButton2);
        panel.add(new JLabel("Transaction"));
        panel.add(radios);

        JButton enter = new JButton("Enter");
        enter.addActionListener(new BankAccountLisener(this));
        JButton interests = new JButton("Interests");
        interests.addActionListener(new BankAccountLisener(this));

        panel.add(enter);
        panel.add(interests);

        textArea = new JTextArea(16, 30);
        textArea.append("Test\n");
        JScrollPane scroll = new JScrollPane(textArea);

        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.SOUTH);
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public ButtonGroup getButtonGroup() {
        return buttonGroup;
    }
}
