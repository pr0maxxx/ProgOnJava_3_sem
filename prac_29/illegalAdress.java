package ru.maksim.ikbo2021.new_pracs.prac_29;

public class illegalAdress extends Error {
    public illegalAdress(String adress) {
        super("There is no such adress " + adress);
    }
}
