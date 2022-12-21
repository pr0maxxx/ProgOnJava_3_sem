package ru.maksim.ikbo2021.new_pracs.prac_7.ex_4;

public class Main {
    public static void main(String[] args) {
        mathFunc calc = new mathFunc();
        System.out.println("Module of complex num (4 + 3i) = " + calc.moduleOfComplex(4.0, 3.0));
        System.out.println("2^3 = " + calc.raisePower(2, 3));
        System.out.println("Area of circle with radius 4 = " + calc.areaOfCircle(4));
    }
}
