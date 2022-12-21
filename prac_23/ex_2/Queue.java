package ru.maksim.ikbo2021.new_pracs.prac_23.ex_2;

public interface Queue {
    void enqueue(Object var1);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();

    String show();
}
