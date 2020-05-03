package be.isims.ihm.tp4.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BankAccountFrm extends JPanel {

    private Bank bank;

    private JTextField textField;
    private JTextArea textArea;
    private JComboBox comboBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup buttonGroup;

    public BankAccountFrm() {
        this.bank = new Bank();
        bank.add(new CurrentAccount(), new SavingsAccount(), new PayingAccount());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 15, 10));

        panel.add(new JLabel("Montant:"));
        textField = new JTextField();
        panel.add(textField);
        panel.add(new JLabel("Account:"));
        comboBox = new JComboBox(bank.getNames());
        panel.add(comboBox);

        buttonGroup = new ButtonGroup();
        JPanel radios = new JPanel();

        radioButton1 = new JRadioButton();
        radioButton1.setText("Add");
        radioButton1.setSelected(true);
        buttonGroup.add(radioButton1);
        radios.add(radioButton1);
        radioButton2 = new JRadioButton();
        radioButton2.setText("Remove");
        buttonGroup.add(radioButton2);
        radios.add(radioButton2);
        panel.add(new JLabel("Transaction"));
        panel.add(radios);

        panel.add(new JButton(new AbstractAction("Enter") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double money = 0.0;
                if (!textField.getText().isEmpty()) {
                    try {
                        money = Double.parseDouble(textField.getText());
                    } catch (NumberFormatException nfe) {}
                    if (radioButton1.isSelected()) {
                        bank.get(comboBox.getSelectedIndex()).add(money);
                    } else if (radioButton2.isSelected()) {
                        bank.get(comboBox.getSelectedIndex()).get(money);
                    }
                    textArea.append(bank.get(comboBox.getSelectedIndex()).toString() + "\n");
                }
            }
        }));

        panel.add(new JButton(new AbstractAction("Interests") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (Account account: bank.getAccounts()) {
                    if (account.update())
                        textArea.append(account.toString() + "\n");
                }
            }
        }));

        textArea = new JTextArea(16, 30);
        textArea.append("Test\n");
        JScrollPane scroll = new JScrollPane(textArea);

        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.SOUTH);
    }

}
