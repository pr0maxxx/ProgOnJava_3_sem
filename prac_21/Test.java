package ru.maksim.ikbo2021.new_pracs.prac_21;


public class Test {
    public static void main(String[] args) {
        ArrayStorage<Integer> storage = new ArrayStorage();
        Integer[] ar = new Integer[]{1, 2, 3, 4, 5};
        storage.setArray(ar);
        System.out.println(storage.get(3));
    }
}
