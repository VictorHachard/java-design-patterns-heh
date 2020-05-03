package be.isims.ihm.tp4.ex3;

import javax.swing.*;
import java.awt.*;

/**
 * https://stackoverflow.com/questions/7824162/about-layouts-in-simple-calculator
 */
public class Calculator extends JPanel {

    protected final String[][] BUTTON_TEXTS = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "*"},
            {"0", ".", "/", "="}
    };
    private final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);

    private JPanel panel;
    private JTextField field;

    public Calculator() {
        field = new JTextField(10);
        field.setFont(BTN_FONT.deriveFont(Font.PLAIN));
        field.setEditable(false);

        CalculatorListener calculatorListener = new CalculatorListener(this);
        JPanel btnPanel = new JPanel(new GridLayout(BUTTON_TEXTS.length,  BUTTON_TEXTS[0].length));
        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
                JButton btn = new JButton(BUTTON_TEXTS[i][j]);
                btn.setFont(BTN_FONT);
                btn.addActionListener(calculatorListener);
                btnPanel.add(btn);
            }
        }
        panel = new JPanel(new BorderLayout());
        panel.add(field, BorderLayout.PAGE_START);
        panel.add(btnPanel, BorderLayout.CENTER);
        add(panel);
    }

    public JTextField getField() {
        return field;
    }

    public void setField(JTextField field) {
        this.field = field;
    }

}
