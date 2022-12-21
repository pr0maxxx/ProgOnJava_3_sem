package ru.maksim.ikbo2021.new_pracs.prac_16;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ugadaika extends JFrame {
    public Ugadaika() {
        super("Ugadaika");
        this.setSize(1080, 720);
        this.setLayout(new BorderLayout());
        final JTextField userInput = new JTextField();
        this.add(userInput, "Center");
        JButton userButton = new JButton("TRY");
        this.add(userButton, "South");
        final int[] counter = new int[]{0};
        final Integer iProgrammValue = ThreadLocalRandom.current().nextInt(0, 21);
        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (userInput.getText().toString() != "") {
                    if (userInput.getText().toString().equals(iProgrammValue.toString())) {
                        JOptionPane.showMessageDialog(Ugadaika.this.getContentPane(), "Good job.", "You are right", -1);
                        Ugadaika.this.setVisible(false);
                        Ugadaika.this.dispose();
                    } else if (counter[0] == 2) {
                        JOptionPane.showMessageDialog(Ugadaika.this.getContentPane(), "Awwww, you lose.", "Good bye", -1);
                        Ugadaika.this.setVisible(false);
                        Ugadaika.this.dispose();
                    } else {
                        int var10002 = counter[0]++;
                        if (Integer.parseInt(userInput.getText().toString()) > iProgrammValue) {
                            JOptionPane.showMessageDialog(Ugadaika.this.getContentPane(), "My value lower than yours", "Nice try.", -1);
                        } else {
                            JOptionPane.showMessageDialog(Ugadaika.this.getContentPane(), "My value bigger than yours", "Nice try.", -1);
                        }
                    }

                }
            }
        });
    }

    public static void main(String[] args) {
        (new Ugadaika()).setVisible(true);
    }
}
