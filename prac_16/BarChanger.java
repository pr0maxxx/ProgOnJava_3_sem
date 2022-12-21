package ru.maksim.ikbo2021.new_pracs.prac_16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class BarChanger extends JFrame {
    public BarChanger() {
        super("TextArea");
        this.setSize(1920, 1080);
        this.setLayout(new BorderLayout());
        final JTextArea textArea = new JTextArea();
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuColors = new JMenu("Colors");
        JMenu jMenuFonts = new JMenu("Fonts");
        JMenuItem jMenuItemBlue = new JMenuItem("Blue");
        JMenuItem jMenuItemRed = new JMenuItem("Red");
        JMenuItem jMenuItemBlack = new JMenuItem("Black");
        final JMenuItem jMenuItemTimes = new JMenuItem("Times New Roman");
        final JMenuItem jMenuItemSans = new JMenuItem("MS Sans Serif");
        final JMenuItem jMenuItemCourier = new JMenuItem("Courier New");
        jMenuColors.add(jMenuItemRed);
        jMenuColors.add(jMenuItemBlue);
        jMenuColors.add(jMenuItemBlack);
        jMenuFonts.add(jMenuItemTimes);
        jMenuFonts.add(jMenuItemSans);
        jMenuFonts.add(jMenuItemCourier);
        jMenuBar.add(jMenuColors);
        jMenuBar.add(jMenuFonts);
        this.setJMenuBar(jMenuBar);
        this.add(textArea, "Center");
        jMenuItemRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        jMenuItemBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.blue);
            }
        });
        jMenuItemBlack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.black);
            }
        });
        jMenuItemTimes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(jMenuItemTimes.getText(), 1, 16));
            }
        });
        jMenuItemCourier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(jMenuItemCourier.getText(), 1, 16));
            }
        });
        jMenuItemSans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(jMenuItemSans.getText(), 1, 16));
            }
        });
    }

    public static void main(String[] args) {
        (new BarChanger()).setVisible(true);
    }
}
