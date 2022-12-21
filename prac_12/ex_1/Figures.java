package ru.maksim.ikbo2021.new_pracs.prac_12.ex_1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figures extends JPanel {
    public Figures() {
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(1080, 720));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();
        new ArrayList();
        String[] shapesName = new String[]{"Circle", "Rectangle", "Triangle"};

        for(int count = 0; count < 20; ++count) {
            String shape = shapesName[random.nextInt(3)];
            byte var8 = -1;
            switch(shape.hashCode()) {
                case -1169699505:
                    if (shape.equals("Rectangle")) {
                        var8 = 1;
                    }
                    break;
                case 1562406440:
                    if (shape.equals("Triangle")) {
                        var8 = 2;
                    }
                    break;
                case 2018617584:
                    if (shape.equals("Circle")) {
                        var8 = 0;
                    }
            }

            switch(var8) {
                case 0:
                    Circle circle = new Circle(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(500), random.nextInt(500), random.nextInt(100));
                    circle.draw(g);
                    break;
                case 1:
                    Rectangle rec = new Rectangle(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(500), random.nextInt(500), random.nextInt(200), random.nextInt(200));
                    rec.draw(g);
                    break;
                case 2:
                    Triangle triangle = new Triangle(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(500), random.nextInt(500));
                    triangle.draw(g);
            }
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Figures());
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setLocationRelativeTo((Component)null);
        frame.setVisible(true);
    }
}
