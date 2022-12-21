package ru.maksim.ikbo2021.new_pracs.prac_23.ex_1;

public class testADT {
    public testADT() {
    }

    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        fill(queue, 10);
        System.out.println(ArrayQueueADT.show(queue));
        System.out.println(ArrayQueueADT.element(queue));
        System.out.println(ArrayQueueADT.dequeue(queue));
        System.out.println(ArrayQueueADT.size(queue));
        System.out.println(ArrayQueueADT.isEmpty(queue));
        ArrayQueueADT.clear(queue);
        System.out.println(ArrayQueueADT.show(queue));
    }

    public static void fill(ArrayQueueADT queueADT, int size) {
        for(int i = 0; i < size; ++i) {
            ArrayQueueADT.enqueue(queueADT, i);
        }

    }
}
