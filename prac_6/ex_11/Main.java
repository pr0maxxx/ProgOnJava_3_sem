package ru.maksim.ikbo2021.new_pracs.prac_6.ex_11;

public class Main {
    public static void main(String[] args) {
        double dbCurrentTemp = -40.0;
        System.out.println("Current temperature: " + dbCurrentTemp);
        System.out.println("Current temperature in Kelvin: " + new KelvinConverter().getConvertedValue(dbCurrentTemp));
        System.out.printf("Current temperature in Fahrenheit: %.2f" ,
                new FahrenheitConverter().getConvertedValue(dbCurrentTemp));
    }
}
