package ru.maksim.ikbo2021.labs.lab_3;

public abstract class Furniture {
    protected int price;
    protected double length;
    protected double width;
    protected double height;
    protected String color;
    protected int article_number;

    public Furniture(int price, double length, double weight, double height, String color, int article_number) {
        this.price = price;
        this.length = length;
        this.width = weight;
        this.height = height;
        this.color = color;
        this.article_number = article_number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArticle_number() {
        return article_number;
    }

    public void setArticle_number(int article_number) {
        this.article_number = article_number;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", length=" + length +
                ", weight=" + width +
                ", height=" + height +
                ", color=" + color +
                ", article_number=" + article_number +
                '}';
    }
}
