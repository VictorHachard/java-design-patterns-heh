package be.isims.ihm.tp4bis.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConverterFrm extends JPanel {

    private JPanel panelConverter;
    private JPanel panelTvaConverter;
    private JPanel panelRadios;

    public ConverterFrm() {
        this.radio();
        this.ConverterFrm();
        this.TvaConverterFrm();
        add(panelConverter, BorderLayout.SOUTH);
    }

    public void radio() {
        panelRadios = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton();
        radioButton1.setText("Amont");
        radioButton1.setSelected(true);
        radioButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(panelTvaConverter);
                add(panelConverter, BorderLayout.SOUTH);
                revalidate();
                repaint();
            }
        });
        buttonGroup.add(radioButton1);
        JRadioButton radioButton2 = new JRadioButton();
        radioButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(panelConverter);
                add(panelTvaConverter, BorderLayout.SOUTH);
                revalidate();
                repaint();
            }
        });
        radioButton2.setText("Taxe");
        buttonGroup.add(radioButton2);

        panelRadios.add(radioButton1);
        panelRadios.add(radioButton2);
        add(panelRadios, BorderLayout.NORTH);
    }

    public void ConverterFrm() {
        panelConverter = new JPanel();
        panelConverter.setLayout(new GridLayout(3, 0, 0, 15));

        JTextField textFieldEur = new JTextField(10);
        JTextField textFieldUsd = new JTextField(10);

        panelConverter.add(textFieldEur);
        textFieldEur.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) { }
            @Override
            public void keyPressed(KeyEvent keyEvent) { }
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                Double usd = 0.0;
                if (! textFieldEur.getText().isEmpty()) {
                    try {
                        usd = Double.parseDouble(textFieldEur.getText()) * 1.36077;
                    } catch(NumberFormatException e) { }
                }
                textFieldUsd.setText(usd.toString());
            }
        });
        panelConverter.add(new JLabel("EUR"));

        panelConverter.add(textFieldUsd);
        textFieldUsd.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) { }
            @Override
            public void keyPressed(KeyEvent keyEvent) { }
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                Double eur = 0.0;
                if (! textFieldUsd.getText().isEmpty()) {
                    try {
                        eur = Double.parseDouble(textFieldUsd.getText()) * 0.734878047;
                    } catch(NumberFormatException ignored) { }
                }
                textFieldEur.setText(eur.toString());

            }
        });
        panelConverter.add(new JLabel("USD"));
    }

    public void TvaConverterFrm() {
        panelTvaConverter = new JPanel();
        panelTvaConverter.setLayout(new GridLayout(5, 0, 0, 15));

        JTextField textFieldHt = new JTextField(10);
        JTextField textFieldTtv = new JTextField(10);
        JTextField textFieldTva = new JTextField();
        textFieldTva.setText("21");
        textFieldTva.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) { }
            @Override
            public void keyPressed(KeyEvent keyEvent) { }
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                Double ttv = 0.0;
                Double ht = 0.0;
                if (! (textFieldTva.getText().isEmpty() || textFieldHt.getText().isEmpty() || textFieldTtv.getText().isEmpty())) {
                    ttv = Double.parseDouble(textFieldHt.getText()) * (1 + Double.parseDouble(textFieldTva.getText()) / 100);
                    textFieldTtv.setText(ttv.toString());
                    ht = Double.parseDouble(textFieldTtv.getText()) / (1 + Double.parseDouble(textFieldTva.getText()) / 100);
                    textFieldHt.setText(ht.toString());
                }
            }
        });

        panelTvaConverter.add(textFieldHt);
        textFieldHt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) { }
            @Override
            public void keyPressed(KeyEvent keyEvent) { }
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                Double res = 0.0;
                if (! (textFieldHt.getText().isEmpty() || textFieldTva.getText().isEmpty())) {
                    try {
                        res = Double.parseDouble(textFieldHt.getText()) * (1 + Double.parseDouble(textFieldTva.getText()) / 100);
                    } catch (NumberFormatException ignored) { }
                }
                textFieldTtv.setText(res.toString());
            }
        });
        panelTvaConverter.add(new JLabel("HT"));

        panelTvaConverter.add(textFieldTtv);
        textFieldTtv.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) { }
            @Override
            public void keyPressed(KeyEvent keyEvent) { }
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                Double res = 0.0;
                if (! (textFieldHt.getText().isEmpty() || textFieldTva.getText().isEmpty())) {
                    try {
                        res = Double.parseDouble(textFieldTtv.getText()) / (1 + Double.parseDouble(textFieldTva.getText()) / 100);
                    } catch (NumberFormatException ignored) { }
                }
                textFieldHt.setText(res.toString());
            }
        });
        panelTvaConverter.add(new JLabel("TTC"));
        panelTvaConverter.add(textFieldTva);
        panelTvaConverter.add(new JLabel("%"));
    }

}
