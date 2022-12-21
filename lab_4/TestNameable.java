package ru.maksim.ikbo2021.labs.lab_4;

public class TestNameable {
    public static void main(String[] args) {
        Nameable n = new Dog("Бобик","Дворняжка");
        System.out.println(n);
        System.out.println(n.getName());
        n = new Planet("Юпитер",71492,true);
        System.out.println(n);
        System.out.println(n.getName());
    }
}
