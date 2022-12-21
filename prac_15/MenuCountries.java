package ru.maksim.ikbo2021.new_pracs.prac_15;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuCountries extends JFrame {
    public MenuCountries() {
        super("Countries");
        this.setLayout(new GridLayout(3, 1));
        Font fontMedium = new Font("Verdana", 0, 24);
        Font fontLarge = new Font("Verdana", 0, 28);
        Font fontSmall = new Font("Verdana", 0, 20);
        JPanel[] panel = new JPanel[3];
        final JLabel countryName = new JLabel(" ");
        final JLabel textPopulation = new JLabel("");
        String[] arCountries = new String[]{"Russia", "Belarus", "Kazakhstan"};
        panel[0] = new JPanel();
        panel[0].setBackground(Color.WHITE);
        panel[1] = new JPanel();
        panel[1].setBackground(Color.WHITE);
        panel[2] = new JPanel();
        panel[2].setBackground(Color.WHITE);
        this.add(panel[0]);
        this.add(panel[1]);
        this.add(panel[2]);
        countryName.setFont(fontMedium);
        panel[1].add(countryName);
        textPopulation.setFont(fontSmall);
        panel[2].add(textPopulation);
        JComboBox comboBox = new JComboBox(arCountries);
        comboBox.setFont(fontLarge);
        comboBox.setBackground(Color.WHITE);
        panel[0].add(comboBox);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                countryName.setText(item);
                byte var5 = -1;
                switch(item.hashCode()) {
                    case -1835785125:
                        if (item.equals("Russia")) {
                            var5 = 1;
                        }
                        break;
                    case 142878344:
                        if (item.equals("Kazakhstan")) {
                            var5 = 2;
                        }
                        break;
                    case 1439988344:
                        if (item.equals("Belarus")) {
                            var5 = 0;
                        }
                }

                switch(var5) {
                    case 0:
                        textPopulation.setText("Population: 9,2 million");
                        break;
                    case 1:
                        textPopulation.setText("Population: 146,1 million");
                        break;
                    case 2:
                        textPopulation.setText("Population: 19,1 million");
                }

            }
        });
        this.setSize(1080, 720);
    }

    public static void main(String[] args) {
        (new MenuCountries()).setVisible(true);
    }
}
