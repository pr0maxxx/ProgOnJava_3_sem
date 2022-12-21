package ru.maksim.ikbo2021.new_pracs.prac_22.ex_2;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Empty string not allowed");
    }
}
