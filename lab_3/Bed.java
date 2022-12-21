package ru.maksim.ikbo2021.labs.lab_3;

public class Bed extends Furniture {
    private int personCount, maxWeight;
    private String mainMaterial;

    public Bed(int price, double length, double weight, double height, String color, int article_number, int personCount, int maxWeight, String mainMaterial) {
        super(price, length, weight, height, color, article_number);
        this.personCount = personCount;
        this.maxWeight = maxWeight;
        this.mainMaterial = mainMaterial;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "personCount=" + personCount +
                ", maxWeight=" + maxWeight +
                ", mainMaterial='" + mainMaterial + '\'' +
                ", " + super.toString() +
                '}';
    }
}