package ru.maksim.ikbo2021.new_pracs.prac_18;

import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException var8) {
            System.out.println("It is not an integer");
        } catch (Exception var9) {
            System.out.println("Exception general");
        } finally {
            System.out.println("\nFinally!");
        }

    }
}