package ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_2;

public class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(){}

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x +", y=" + y + '}';
    }
}