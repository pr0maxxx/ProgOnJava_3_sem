package ru.maksim.ikbo2021.new_pracs.prac_6.ex_3;

class CarName implements Nameable{
    String model;
    String brand;
    String type;

    public CarName(String model, String brand, String type){
        this.model = model;
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return model + " " + brand;
    }
}