package ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_2;

import ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_2.Circle;
import ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_2.Point;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        double x, y;
        int len = 3, r;
        Circle[] arr = new Circle[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Окружность " + (i + 1) + ":");
            Scanner source = new Scanner(System.in);
            System.out.println("Введите x ");
            x = source.nextDouble();
            System.out.println("Введите y ");
            y = source.nextDouble();
            Point p1 = new Point(x, y);
            r = (int)(Math.random() * 100);
            arr[i] = new Circle(p1, r);
        }
        for (int i = 0; i < len; i++)
        {
            System.out.print("Окружность " + (i + 1) + ": ");
            System.out.println(arr[i]);
        }
        Circle mx = new Circle(new Point(1, 1), 0);
        for (int i = 0; i < len; i++)
        {
            if (arr[i].Compare(mx) == 1)
                mx = arr[i];
        }
        System.out.println("Самая большая окружность: " + mx);
        Circle mn = new Circle(new Point(1, 1), 10000);
        for (int i = 0; i < len; i++)
        {
            if (arr[i].Compare(mn) == 0)
                mn = arr[i];
        }
        System.out.println("Самая маленькая окружность: " + mn);
    }
}