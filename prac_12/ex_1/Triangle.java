package ru.maksim.ikbo2021.new_pracs.prac_12.ex_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Triangle extends Shape {
    Point a;
    Point b;
    Point c;
    private Random random = new Random();

    public Triangle(int r, int g, int b, int x, int y) {
        super(r, g, b, x, y);
        this.a = new Point(x + this.random.nextInt(-150, 150), x + this.random.nextInt(-150, 150));
        this.b = new Point(x + this.random.nextInt(-150, 150), x + this.random.nextInt(-150, 150));
        this.c = new Point(x + this.random.nextInt(-150, 150), x + this.random.nextInt(-150, 150));
    }

    public void draw(Graphics g) {
        int[] xPoints = new int[]{this.a.x, this.b.x, this.c.x};
        int[] yPoints = new int[]{this.a.y, this.b.y, this.c.y};
        Graphics2D g2d = (Graphics2D)g;
        GeneralPath triangle = new GeneralPath();
        triangle.moveTo((float)(xPoints[0] + this.center.x), (float)(yPoints[0] + this.center.y));

        for(int i = 1; i < xPoints.length; ++i) {
            triangle.lineTo((float)(xPoints[i] + this.center.x), (float)(yPoints[i] + this.center.y));
        }

        triangle.closePath();
        g2d.setColor(new Color(this.color.iRed, this.color.iGreen, this.color.iBlue));
        g2d.fill(triangle);
    }
}
