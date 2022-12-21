package ru.maksim.ikbo2021.new_pracs.prac_18;

public class Exception5 {
    public static void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
    }

    public static void main(String[] args) {
        try {
            getDetails((String)null);
        } catch (NullPointerException var2) {
            System.out.println(var2);
        }

    }
}