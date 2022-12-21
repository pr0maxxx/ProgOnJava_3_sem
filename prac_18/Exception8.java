package ru.maksim.ikbo2021.new_pracs.prac_18;

import java.util.Scanner;

public class Exception8 {
  public static void getKey() {
        Scanner myScanner = new Scanner(System.in);

        while(true) {
            try {
                String key = myScanner.next();
                printDetails(key);
                return;
            } catch (Exception var2) {
                System.out.println("Enter one more time");
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception var2) {
            throw var2;
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("a")) {
            throw new Exception("Key set to empty string");
        } else {
            return "data for " + key;
        }
    }

    public static void main(String[] args) {
        getKey();
    }
}
