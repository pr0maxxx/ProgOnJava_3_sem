package ru.maksim.ikbo2021.new_pracs.prac_30;

public final class Drink extends MenuItem implements Alcoholable {
    private final DrinkTypeEnum type;
    private final double alcoholVol;

    public Drink(String name, String description, int cost, DrinkTypeEnum type, double alcoholVol) {
        super(name, description, cost);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return this.type;
    }

    public boolean isAlcoholicDrink() {
        return this.type.isAlcohol();
    }

    public double getAlcoholVol() {
        return this.alcoholVol;
    }

    public String toString() {
        String var10000 = this.getName();
        return " " + var10000 + " " + this.getDescription() + " " + this.getCost();
    }
}
