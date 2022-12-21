package ru.maksim.ikbo2021.new_pracs.prac_15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    Calculator() {
        super("calculator");
        this.setSize(200, 300);
        this.setMaximumSize(new Dimension(200, 300));
        final String[] s0 = new String[]{""};
        final String[] s1 = new String[]{""};
        final String[] s2 = new String[]{""};
        final JTextField textUserInput = new JTextField(16);
        textUserInput.setEditable(false);
        textUserInput.setBackground(Color.white);
        JButton btnZero = new JButton("0");
        btnZero.setBackground(Color.WHITE);
        JButton btnOne = new JButton("1");
        btnOne.setBackground(Color.WHITE);
        JButton btnTwo = new JButton("2");
        btnTwo.setBackground(Color.WHITE);
        JButton btnThree = new JButton("3");
        btnThree.setBackground(Color.WHITE);
        JButton btnFour = new JButton("4");
        btnFour.setBackground(Color.WHITE);
        JButton btnFive = new JButton("5");
        btnFive.setBackground(Color.WHITE);
        JButton btnSix = new JButton("6");
        btnSix.setBackground(Color.WHITE);
        JButton btnSeven = new JButton("7");
        btnSeven.setBackground(Color.WHITE);
        JButton btnEight = new JButton("8");
        btnEight.setBackground(Color.WHITE);
        JButton btnNine = new JButton("9");
        btnNine.setBackground(Color.WHITE);
        JButton btnResult = new JButton("=");
        btnResult.setBackground(Color.WHITE);
        JButton btnPlus = new JButton("+");
        btnPlus.setBackground(Color.WHITE);
        JButton btnMinus = new JButton("-");
        btnMinus.setBackground(Color.WHITE);
        JButton btnDevide = new JButton("/");
        btnDevide.setBackground(Color.WHITE);
        JButton btnMultiply = new JButton("*");
        btnMultiply.setBackground(Color.WHITE);
        JButton btnClear = new JButton("C");
        btnClear.setBackground(Color.WHITE);
        JButton btnDot = new JButton(".");
        btnDot.setBackground(Color.WHITE);
        JPanel panelMain = new JPanel();
        ActionListener btnActionListenter = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                String var10001;
                if ((s.charAt(0) < '0' || s.charAt(0) > '9') && s.charAt(0) != '.') {
                    if (s.charAt(0) == 'C') {
                        s0[0] = s1[0] = s2[0] = "";
                        var10001 = s0[0];
                        textUserInput.setText(var10001 + s1[0] + s2[0]);
                    } else {
                        double te;
                        if (s.charAt(0) == '=') {
                            if (s1[0].equals("+")) {
                                te = Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]);
                            } else if (s1[0].equals("-")) {
                                te = Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]);
                            } else if (s1[0].equals("/")) {
                                te = Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]);
                            } else {
                                te = Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]);
                            }

                            var10001 = s0[0];
                            textUserInput.setText(var10001 + s1[0] + s2[0] + "=" + te);
                            s0[0] = Double.toString(te);
                            s1[0] = s2[0] = "";
                        } else {
                            if (!s1[0].equals("") && !s2[0].equals("")) {
                                if (s1[0].equals("+")) {
                                    te = Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]);
                                } else if (s1[0].equals("-")) {
                                    te = Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]);
                                } else if (s1[0].equals("/")) {
                                    te = Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]);
                                } else {
                                    te = Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]);
                                }

                                s0[0] = Double.toString(te);
                                s1[0] = s;
                                s2[0] = "";
                            } else {
                                s1[0] = s;
                            }

                            var10001 = s0[0];
                            textUserInput.setText(var10001 + s1[0] + s2[0]);
                        }
                    }
                } else {
                    if (!s1[0].equals("")) {
                        String[] var10000 = s2;
                        var10000[0] = var10000[0] + s;
                    } else {
                        String var10002 = s0[0];
                        s0[0] = var10002 + s;
                    }

                    var10001 = s0[0];
                    textUserInput.setText(var10001 + s1[0] + s2[0]);
                }

            }
        };
        btnMultiply.addActionListener(btnActionListenter);
        btnDevide.addActionListener(btnActionListenter);
        btnMinus.addActionListener(btnActionListenter);
        btnPlus.addActionListener(btnActionListenter);
        btnNine.addActionListener(btnActionListenter);
        btnEight.addActionListener(btnActionListenter);
        btnSeven.addActionListener(btnActionListenter);
        btnSix.addActionListener(btnActionListenter);
        btnFive.addActionListener(btnActionListenter);
        btnFour.addActionListener(btnActionListenter);
        btnThree.addActionListener(btnActionListenter);
        btnTwo.addActionListener(btnActionListenter);
        btnOne.addActionListener(btnActionListenter);
        btnZero.addActionListener(btnActionListenter);
        btnDot.addActionListener(btnActionListenter);
        btnClear.addActionListener(btnActionListenter);
        btnResult.addActionListener(btnActionListenter);
        panelMain.add(textUserInput);
        panelMain.add(btnPlus);
        panelMain.add(btnOne);
        panelMain.add(btnTwo);
        panelMain.add(btnThree);
        panelMain.add(btnMinus);
        panelMain.add(btnFour);
        panelMain.add(btnFive);
        panelMain.add(btnSix);
        panelMain.add(btnMultiply);
        panelMain.add(btnSeven);
        panelMain.add(btnEight);
        panelMain.add(btnNine);
        panelMain.add(btnDevide);
        panelMain.add(btnDot);
        panelMain.add(btnZero);
        panelMain.add(btnClear);
        panelMain.add(btnResult);
        panelMain.setBackground(Color.GRAY);
        this.add(panelMain);
    }

    public static void main(String[] args) {
        (new Calculator()).setVisible(true);
    }
}
