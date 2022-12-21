package ru.maksim.ikbo2021.new_pracs.prac_6.ex_6_9;

interface Printable {

    public default void print(){
        System.out.println("Author: ****\nyear: ****\nsummary:\n");
    }

}