package ru.maksim.ikbo2021.new_pracs.prac_21;

public class ArrayStorage<E> {
    private E[] array;

    public E get(int index) {
        return this.array[index];
    }

    public void setArray(E[] array) {
        this.array = array;
    }
}
