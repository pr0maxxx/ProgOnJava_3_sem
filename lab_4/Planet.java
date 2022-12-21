package ru.maksim.ikbo2021.labs.lab_4;

public class Planet implements Nameable{
    private String name;
    private int radius;
    private boolean isSatellites;

    public Planet(String name, int radius, boolean isSatellites) {
        this.name = name;
        this.radius = radius;
        this.isSatellites = isSatellites;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", isSatellites=" + isSatellites +
                '}';
    }
}
