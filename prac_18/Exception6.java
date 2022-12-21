package ru.maksim.ikbo2021.new_pracs.prac_18;

public class Exception6 {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception var2) {
            System.out.println("Message is empty");
        }

    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException(" null key in getDetails");
        } else {
            return "data for" + key;
        }
    }

    public static void main(String[] args) {
        printMessage((String)null);
    }
}
