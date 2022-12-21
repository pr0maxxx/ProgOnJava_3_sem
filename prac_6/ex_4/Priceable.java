package ru.maksim.ikbo2021.new_pracs.prac_6.ex_4;

interface Priceable {
    public default String getPrice(){
        return "0.0";
    }
}