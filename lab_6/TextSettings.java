package ru.maksim.ikbo2021.labs.lab_6;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class TextSettings extends JFrame {

    private TextSettings(){
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(400,200);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));

        String[] colors = {"Черный", "Красный", "Синий"};
        JComboBox<String> colors_box = new JComboBox<>(colors);
        colors_box.setSelectedIndex(0);

        String[] f = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts_box = new JComboBox<>(f);
        fonts_box.setSelectedIndex(0);

        fonts_box.addItemListener(e -> textArea.setFont(new Font(f[fonts_box.getSelectedIndex()], Font.PLAIN, 16)));

        colors_box.addItemListener(e -> {
            Color c = switch (colors_box.getSelectedIndex()) {
                case 1 -> Color.RED;
                case 2 -> Color.BLUE;
                default -> Color.BLACK;
            };
            textArea.setForeground(c);
        });

        getContentPane().add(colors_box, BorderLayout.SOUTH);
        getContentPane().add(fonts_box, BorderLayout.NORTH);
        getContentPane().add(textArea);

    }

    public static void main(String[] args) {
        new TextSettings().setVisible(true);
    }
}