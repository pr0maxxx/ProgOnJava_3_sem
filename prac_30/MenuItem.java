package ru.maksim.ikbo2021.new_pracs.prac_30;

public class MenuItem {
    String name;
    String description;
    int cost;

    public MenuItem(String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCost() {
        return this.cost;
    }
}
