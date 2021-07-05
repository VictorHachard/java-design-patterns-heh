package be.isims.ihm.tp4.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorListener implements ActionListener {

    private Calculator calculator;
    private String operator = "";
    private String oper1Str = "";
    private String oper2Str = "";
    private Double oper1, oper2;
    private boolean reset = false;

    public CalculatorListener(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String buttonText = ((JButton) actionEvent.getSource()).getText();
        System.out.println(buttonText);
        if (reset) {
            reset = false;
            operator = "";
            oper1Str = "";
            oper2Str = "";
            calculator.getField().setText("");
        }
        if (isEqual(buttonText)) {
            calculator.getField().setText(calculator.getField().getText() + buttonText);
            oper2 = Double.parseDouble(oper2Str);
            oper1 = Double.parseDouble(oper1Str);
            switch (operator) {
                case "+":
                    calculator.getField().setText(calculator.getField().getText() + add().toString());
                    break;
                case "*":
                    calculator.getField().setText(calculator.getField().getText() + mul().toString());
                    break;
                case "-":
                    calculator.getField().setText(calculator.getField().getText() + min().toString());
                    break;
                case "/":
                    calculator.getField().setText(calculator.getField().getText() + div().toString());
                    break;
                default:
                    calculator.getField().setText(calculator.getField().getText() + add().toString());
            }
            reset = true;
        } else if (isOperator(buttonText)) {
            operator = buttonText;
            calculator.getField().setText(calculator.getField().getText() + operator);
        } else {
            if (operator.isEmpty())
                oper1Str += buttonText;
            else
                oper2Str += buttonText;
            calculator.getField().setText(calculator.getField().getText() + buttonText);
        }

        System.out.println(toString());
        System.out.println("------------");
    }

    @Override
    public String toString() {
        return "CalculatorListener{" +
                "operator='" + operator + '\'' +
                ", oper1=" + oper1Str +
                ", oper2=" + oper2Str +
                '}';
    }

    private Double add() {
        return oper1 + oper2;
    }

    private Double min() {
        return oper1 - oper2;
    }

    private Double div() {
        return oper1 / oper2;
    }

    private Double mul() {
        return oper1 * oper2;
    }

    private boolean isOperator(String str) {
        switch (str) {
            case "+":
            case "*":
            case "-":
            case "/":
                return true;
        }
        return false;
    }

    private boolean isEqual(String str) {
        return str.equals("=");
    }

}
