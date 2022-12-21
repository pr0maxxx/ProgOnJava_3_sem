package ru.maksim.ikbo2021.new_pracs.prac_22.ex_2;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Division by zero! Retry with another expression");
    }
}
