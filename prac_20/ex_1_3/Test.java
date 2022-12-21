package ru.maksim.ikbo2021.new_pracs.prac_20.ex_1_3;

public class Test {
   public static void main(String[] args) {
        ThreeClasses<Integer, String, AnimalNext> tmp = new ThreeClasses(5, "tmp", new AnimalNext(5, "tmp", 10));
        tmp.showClassesName();
    }
}
