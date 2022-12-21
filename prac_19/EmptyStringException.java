package ru.maksim.ikbo2021.new_pracs.prac_19;


public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Empty string not allowed");
    }
}
