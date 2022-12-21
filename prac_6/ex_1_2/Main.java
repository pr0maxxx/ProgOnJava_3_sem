package ru.maksim.ikbo2021.new_pracs.prac_6.ex_1_2;

public class Main {
    public static void main(String[] args) {
//         test 1 - 2
        MovableRectangle rect = new MovableRectangle(0, 0, 4, 4, 5, 5);
        System.out.println("Before move:\n" + rect.toString());
        rect.moveDown();
        rect.moveRight();
        System.out.println("\nAfter move:\n" + rect.toString());
        rect.moveUp();
        rect.moveLeft();
        System.out.println("\nAfter move:\n" + rect.toString());
    }
}