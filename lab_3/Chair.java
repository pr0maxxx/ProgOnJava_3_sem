package ru.maksim.ikbo2021.labs.lab_3;

public class Chair extends Furniture{
    private String  mainMaterial;
    private boolean isCircle;

    public Chair(int price, double length, double weight, double height, String color, int article_number, String mainMaterial, boolean isCircle) {
        super(price, length, weight, height, color, article_number);
        this.mainMaterial = mainMaterial;
        this.isCircle = isCircle;
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public boolean isCircle() {
        return isCircle;
    }

    public void setCircle(boolean circle) {
        isCircle = circle;
    }

    @Override
    public String toString() {
        return "Chair{" +
                " mainMaterial='" + mainMaterial + '\'' +
                ", isCircle=" + isCircle +
                ", " + super.toString() +
                '}';
    }

}
