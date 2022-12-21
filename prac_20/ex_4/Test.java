package ru.maksim.ikbo2021.new_pracs.prac_20.ex_4;


public class Test {
    public static void main(String[] args) {
        MinMax<Double> tmp = new MinMax(new Double[]{14.0, 5.0, 7.5, 3.0, 2.5});
        System.out.println(tmp.findMin());
        System.out.println(tmp.findMax());
    }
}
