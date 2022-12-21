package ru.maksim.ikbo2021.new_pracs.prac_11.ex_3;

import java.text.ParseException;

public class Test {
    public Test() {
    }

    public static void main(String[] args) throws ParseException {
        Student student1 = new Student(1, 500.0D, "02.10.2022", 3);
        System.out.println(student1);
    }
}
