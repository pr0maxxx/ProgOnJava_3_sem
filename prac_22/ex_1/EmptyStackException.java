package ru.maksim.ikbo2021.new_pracs.prac_22.ex_1;

public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("Stack is empty! Retry with another expression");
    }
}
