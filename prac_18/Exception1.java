package ru.maksim.ikbo2021.new_pracs.prac_18;

public class Exception1 {
    public Exception1() {
    }

    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException var2) {
            System.out.println("Attempted division by zero");
        }

    }
}
