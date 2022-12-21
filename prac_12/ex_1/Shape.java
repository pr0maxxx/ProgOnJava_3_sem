package ru.maksim.ikbo2021.new_pracs.prac_12.ex_1;

public class Shape {
    RGBColor color;
    Point center;

    public Shape(int iRed, int iGreen, int iBlue, int x, int y) {
        this.color = new RGBColor(iRed, iGreen, iBlue);
        this.center = new Point(x, y);
    }
}
