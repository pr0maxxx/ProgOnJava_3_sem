package ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_2;


public class Circle {
    private Point mid;
    private int r;

    public Circle(Point mid, int r)
    {
        this.mid = mid;
        this.r = r;
    }

    public Point getMid() { return mid; }
    public void setMid(Point mid) { this.mid = mid; }

    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }

    public void move(double xDisp, double yDisp)
    {
        this.mid.setX(mid.getX() + xDisp);
        this.mid.setY(mid.getY() + yDisp);
    }

    public int Compare(Circle c2)
    {
        if (r > c2.getR())
            return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + mid.getX() +", y=" + mid.getY() + ", r=" + r + '}';
    }
}