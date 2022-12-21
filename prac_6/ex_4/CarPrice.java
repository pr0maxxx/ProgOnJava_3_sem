package ru.maksim.ikbo2021.new_pracs.prac_6.ex_4;

class CarPrice implements Priceable{
    private Integer price = 5;

    public CarPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String getPrice(){
        return this.price.toString();
    }
}