package ru.maksim.ikbo2021.new_pracs.prac_11.ex_4;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Date userDate = new Date();
        Scanner keyboard = new Scanner(System.in);
        userDate.setYear(keyboard.nextInt() - 1900);
        userDate.setMonth(keyboard.nextInt() - 1);
        userDate.setDate(keyboard.nextInt());
        userDate.setHours(keyboard.nextInt());
        userDate.setMinutes(keyboard.nextInt());
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm");
        PrintStream var10000 = System.out;
        String var10001 = dateFormatter.format(userDate);
        var10000.println("Date: " + var10001);
        Calendar userCalendar = Calendar.getInstance();
        userCalendar.set(1, keyboard.nextInt());
        userCalendar.set(2, keyboard.nextInt() - 1);
        userCalendar.set(5, keyboard.nextInt());
        userCalendar.set(10, keyboard.nextInt());
        userCalendar.set(12, keyboard.nextInt());
        SimpleDateFormat calFormatter = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm");
        var10000 = System.out;
        var10001 = calFormatter.format(userCalendar.getTime());
        var10000.println("Calendar: " + var10001);
    }
}
