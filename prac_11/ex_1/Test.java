package ru.maksim.ikbo2021.new_pracs.prac_11.ex_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {
    public Test() {
    }

    public static void main(String[] args) throws ParseException {
        Task first = new Task("Vaidov", (new SimpleDateFormat("dd.MM.yyyy")).parse("28.12.2021"));
        first.setEndDate(new Date());
        System.out.println(first);
    }
}
