package ru.maksim.ikbo2021.new_pracs.prac_23.ex_1;

public class testQueue {
    public testQueue() {
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        fill(queue, 10);
        System.out.println(queue.show());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue.show());
    }

    public static void fill(ArrayQueue queue, int size) {
        for(int i = 0; i < size; ++i) {
            queue.enqueue(i);
        }

    }
}