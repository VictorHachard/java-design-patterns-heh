package be.isims.ihm.tp4.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountLisener implements ActionListener {

    private BankAccount bankAccount;

    public BankAccountLisener(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton button = (JButton)actionEvent.getSource();
        double money = 0.0;
        if (!bankAccount.getTextField().getText().isEmpty())
            money = Double.parseDouble(bankAccount.getTextField().getText());
        if (button.getText().equals("Enter")) {
            if (bankAccount.getComboBox().getSelectedIndex() == 0) { //Current Account
                if (bankAccount.getRadioButton1().isSelected()) {
                    bankAccount.getCurrentAccount().add(money);
                } else if (bankAccount.getRadioButton2().isSelected()) {
                    bankAccount.getCurrentAccount().add(- money);
                }
                bankAccount.getTextArea().append(bankAccount.getCurrentAccount().toString() + "\n");
            } else {
                if (bankAccount.getRadioButton1().isSelected()) {
                    bankAccount.getSavingsAccount().add(money);
                } else if (bankAccount.getRadioButton2().isSelected()) {
                    bankAccount.getSavingsAccount().add(- money);
                }
                bankAccount.getTextArea().append(bankAccount.getSavingsAccount().toString() + "\n");
            }
        } else {

        }
    }

}
