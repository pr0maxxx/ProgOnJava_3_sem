package ru.maksim.ikbo2021.new_pracs.prac_6.ex_4;

class Dress implements Priceable{

    Double price = 5.5;

    public Dress(Double price) {
        this.price = price;
    }

    @Override
    public String getPrice(){
        return this.price.toString();
    }
}