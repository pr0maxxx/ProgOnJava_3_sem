package ru.maksim.ikbo2021.new_pracs.prac_12.ex_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D.Double;

public class Circle extends Shape {
    int iDiameter;

    public Circle(int iRed, int iGreen, int iBlue, int x, int y, int iDiameter) {
        super(iRed, iGreen, iBlue, x, y);
        this.iDiameter = iDiameter;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Double circle = new Double((double)this.center.x, (double)this.center.y, (double)this.iDiameter, (double)this.iDiameter);
        g2d.setColor(new Color(this.color.iRed, this.color.iGreen, this.color.iBlue));
        g2d.fill(circle);
    }
}
