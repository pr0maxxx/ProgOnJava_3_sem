package ru.maksim.ikbo2021.new_pracs.prac_12.ex_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D.Double;

public class Rectangle extends Shape {
    int iWidth;
    int iHeight;

    public Rectangle(int iRed, int iGreen, int iBlue, int x, int y, int iWidth, int iHeight) {
        super(iRed, iGreen, iBlue, x, y);
        this.iWidth = iWidth;
        this.iHeight = iHeight;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Double rec = new Double((double)this.center.x, (double)this.center.y, (double)this.iWidth, (double)this.iHeight);
        g2d.setColor(new Color(this.color.iRed, this.color.iRed, this.color.iRed));
        g2d.fill(rec);
    }
}
