package ru.maksim.ikbo2021.pracs.pr_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NullLayout extends JFrame
{
    JButton ac_milan = new JButton("AC Milan");;
    JButton real_madrid = new JButton("Real Madrid");;
    JLabel last_score_label = new JLabel("Last Scorer: ");
    JLabel resLabel = new JLabel("Result: 0 X 0");
    JLabel winLabel = new JLabel("Winner: AC Milan");
    private int mil = 0, rea = 0;
    public NullLayout() {
        setLayout(null);
        ac_milan.setBounds(350, 150, 150, 40);
        real_madrid.setBounds(100, 150, 150, 40);
        last_score_label.setSize(150, 100);
        last_score_label.setLocation(375, 175);
        resLabel.setSize(150, 100);
        resLabel.setLocation(125, 175);
        winLabel.setSize(150,100);
        winLabel.setLocation(250,200);
        add(ac_milan);
        add(real_madrid);
        add(last_score_label);
        add(resLabel);
        add(winLabel);
        setSize(600,400);
        ac_milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil += 1;
                resLabel.setText("Result: " + mil + " X " + rea);
                last_score_label.setText("Last Scorer: AC Milan");
                if (rea > mil) winLabel.setText("Winner: Real Madrid");
                else if (rea == mil) winLabel.setText("Winner: DRAW");
                else winLabel.setText("Winner: AC Milan");
            }
        });
        real_madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rea += 1;
                resLabel.setText("Result: " + mil + " X " + rea);
                last_score_label.setText("Last Scorer: Real Madrid");
                if (rea > mil) winLabel.setText("Winner: Real Madrid");
                else if (rea == mil) winLabel.setText("Winner: DRAW");
                else winLabel.setText("Winner: AC Milan");
            }
        });
    }

    public static void main(String[]args)
    {
        new NullLayout().setVisible(true);
    }
}