package ru.maksim.ikbo2021.new_pracs.prac_29;

public class OrderAlreadyException extends Exception {
    public OrderAlreadyException(String adress) {
        super("The order for " + adress + " is added!");
    }
}
