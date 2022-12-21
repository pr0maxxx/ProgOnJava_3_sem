package ru.maksim.ikbo2021.pracs.pr_1;

public class Ball {
    private int radius;
    private String color;
    private int condition;

    public Ball(int radius, String color, int condition) {
        this.radius = radius;
        this.color = color;
        this.condition = condition;
    }

    public Ball() {
        this.radius = 1;
        this.color = "blue";
        this.condition = 0;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", condition=" + condition +
                '}';
    }
}
