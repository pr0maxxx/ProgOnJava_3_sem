package ru.maksim.ikbo2021.new_pracs.prac_30;

public class Dish extends MenuItem {
    public Dish(String name, String description, int cost) {
        super(name, description, cost);
    }

    public String toString() {
        String var10000 = this.getName();
        return " " + var10000 + " " + this.getDescription() + " " + this.getCost();
    }
}
