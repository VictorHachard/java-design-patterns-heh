package be.isims.ihm.tp4.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountFrm implements ActionListener {

    private BankAccount bankAccount;
    private JPanel panel;
    private JLabel labelBalance;
    private JTextField textFieldBalance;
    private JTextArea textArea;

    public BankAccountFrm(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        panel = new JPanel();
        JLabel labelBtn = new JLabel("Balance: ");
        textFieldBalance = new JTextField(10);
        JButton button = new JButton("Add");
        button.addActionListener(this);
        JLabel labelBalanceText = new JLabel("Your balance: ");
        labelBalance = new JLabel(Double.toString(bankAccount.getLastBalance()));
        textArea = new JTextArea();
        textArea.append(Double.toString(bankAccount.getLastBalance()) + "\n");
        panel.add(labelBtn);
        panel.add(textFieldBalance);
        panel.add(button);
        panel.add(labelBalanceText);
        panel.add(labelBalance);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (textFieldBalance.getText().matches("-?\\d+(\\.\\d+)?")) {
            bankAccount.addDepot(Double.parseDouble(textFieldBalance.getText()));
            labelBalance.setText(Double.toString(bankAccount.getLastBalance()));
            textArea.append(Double.toString(bankAccount.getLastBalance()) + "\n");
        }
    }

}
