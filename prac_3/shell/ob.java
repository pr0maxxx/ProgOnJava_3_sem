package ru.maksim.ikbo2021.new_pracs.prac_3.shell;

public class ob {
    public static void main(String[] args)
    {
        System.out.println("------------ Задание 1");
        String dbl = "2.5";
        Double x1 = Double.valueOf(dbl);
        System.out.println(x1);
        System.out.println("------------ Задание 2");
        double x2 = Double.parseDouble(dbl);
        System.out.println(x2);
        System.out.println("------------ Задание 3");
        Double n3 = 4.85;
        double x3 = n3;
        int i = (int)x3;
        short s = (short)x3;
        byte b = (byte)x3;
        long l = (long)x3;
        float f = (float)x3;
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("------------ Задание 4");
        System.out.println("Значение объекта Double: " + n3);
        System.out.println("------------ Задание 5");
        double pi = 3.14;
        Double d1 = pi;
        String str = Double.toString(pi);
        System.out.println(str);
    }
}
