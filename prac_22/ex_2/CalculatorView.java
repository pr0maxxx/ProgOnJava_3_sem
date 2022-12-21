package ru.maksim.ikbo2021.new_pracs.prac_22.ex_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView {
    private JPanel panelMainFrame;
    private JButton btnZero;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnDevide;
    private JButton btnMultiply;
    private JButton btnDot;
    private JButton btnClear;
    private JButton btnResult;
    private JTextField textUserInputField;

    public CalculatorView(JPanel panelMainFrame) {
        this.panelMainFrame = panelMainFrame;
        panelMainFrame.setSize(200, 300);
        panelMainFrame.setMaximumSize(new Dimension(200, 300));
        this.btnZero = new JButton("0");
        this.btnZero.setBackground(Color.WHITE);
        this.btnOne = new JButton("1");
        this.btnOne.setBackground(Color.WHITE);
        this.btnTwo = new JButton("2");
        this.btnTwo.setBackground(Color.WHITE);
        this.btnThree = new JButton("3");
        this.btnThree.setBackground(Color.WHITE);
        this.btnFour = new JButton("4");
        this.btnFour.setBackground(Color.WHITE);
        this.btnFive = new JButton("5");
        this.btnFive.setBackground(Color.WHITE);
        this.btnSix = new JButton("6");
        this.btnSix.setBackground(Color.WHITE);
        this.btnSeven = new JButton("7");
        this.btnSeven.setBackground(Color.WHITE);
        this.btnEight = new JButton("8");
        this.btnEight.setBackground(Color.WHITE);
        this.btnNine = new JButton("9");
        this.btnNine.setBackground(Color.WHITE);
        this.btnResult = new JButton("=");
        this.btnResult.setBackground(Color.WHITE);
        this.btnPlus = new JButton("+");
        this.btnPlus.setBackground(Color.WHITE);
        this.btnMinus = new JButton("-");
        this.btnMinus.setBackground(Color.WHITE);
        this.btnDevide = new JButton("/");
        this.btnDevide.setBackground(Color.WHITE);
        this.btnMultiply = new JButton("*");
        this.btnMultiply.setBackground(Color.WHITE);
        this.btnClear = new JButton("C");
        this.btnClear.setBackground(Color.WHITE);
        this.btnDot = new JButton(".");
        this.btnDot.setBackground(Color.WHITE);
        this.textUserInputField = new JTextField(16);
        this.textUserInputField.setEditable(false);
        this.textUserInputField.setBackground(Color.white);
        JPanel panelMain = new JPanel();
        panelMain.add(this.textUserInputField);
        panelMain.add(this.btnPlus);
        panelMain.add(this.btnOne);
        panelMain.add(this.btnTwo);
        panelMain.add(this.btnThree);
        panelMain.add(this.btnMinus);
        panelMain.add(this.btnFour);
        panelMain.add(this.btnFive);
        panelMain.add(this.btnSix);
        panelMain.add(this.btnMultiply);
        panelMain.add(this.btnSeven);
        panelMain.add(this.btnEight);
        panelMain.add(this.btnNine);
        panelMain.add(this.btnDevide);
        panelMain.add(this.btnDot);
        panelMain.add(this.btnZero);
        panelMain.add(this.btnClear);
        panelMain.add(this.btnResult);
        panelMain.setBackground(Color.GRAY);
        panelMainFrame.add(panelMain);
    }

    public void setActionListener(ActionListener actionListener) {
        this.btnMultiply.addActionListener(actionListener);
        this.btnDevide.addActionListener(actionListener);
        this.btnMinus.addActionListener(actionListener);
        this.btnPlus.addActionListener(actionListener);
        this.btnNine.addActionListener(actionListener);
        this.btnEight.addActionListener(actionListener);
        this.btnSeven.addActionListener(actionListener);
        this.btnSix.addActionListener(actionListener);
        this.btnFive.addActionListener(actionListener);
        this.btnFour.addActionListener(actionListener);
        this.btnThree.addActionListener(actionListener);
        this.btnTwo.addActionListener(actionListener);
        this.btnOne.addActionListener(actionListener);
        this.btnZero.addActionListener(actionListener);
        this.btnDot.addActionListener(actionListener);
        this.btnClear.addActionListener(actionListener);
        this.btnResult.addActionListener(actionListener);
    }

    public String getUserInput() {
        return this.textUserInputField.getText();
    }

    public void setTextUserInputField(String text) {
        this.textUserInputField.setText(text);
    }

    public void showAlertDialog(String message) {
        JOptionPane.showMessageDialog(this.panelMainFrame, message);
    }
}
