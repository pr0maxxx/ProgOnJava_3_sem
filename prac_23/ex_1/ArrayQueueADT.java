package ru.maksim.ikbo2021.new_pracs.prac_23.ex_1;

public class ArrayQueueADT {
    private int currentSize = 0;
    private int realSize = 8;
    private Object[] array;

    public ArrayQueueADT() {
        this.array = new Object[this.realSize];
        this.currentSize = 0;
    }

    private static void increaseRealSize(ArrayQueueADT current, int newSize) {
        if (newSize >= current.array.length) {
            current.realSize = newSize;
            Object[] tmp = new Object[current.realSize];
            System.arraycopy(current.array, 0, tmp, 0, current.currentSize);
            current.array = tmp;
        }
    }

    public static void enqueue(ArrayQueueADT current, Object newElement) {
        if (newElement != null) {
            if ((double)(current.array.length + 1) >= (double)current.realSize * 0.75D) {
                increaseRealSize(current, current.realSize * 2);
            }

            current.array[current.currentSize++] = newElement;
        }
    }

    public static Object element(ArrayQueueADT current) {
        return isEmpty(current) ? null : current.array[0];
    }

    public static Object dequeue(ArrayQueueADT current) {
        if (isEmpty(current)) {
            return null;
        } else {
            Object[] tmp = new Object[current.realSize];
            Object firstElement = current.array[0];
            System.arraycopy(current.array, 0, tmp, 0, current.currentSize--);
            current.array = tmp;
            return firstElement;
        }
    }

    public static int size(ArrayQueueADT current) {
        return current.currentSize;
    }

    public static boolean isEmpty(ArrayQueueADT current) {
        return current.currentSize == 0;
    }

    public static void clear(ArrayQueueADT current) {
        current.currentSize = 0;
        current.realSize = 8;
        current.array = new Object[current.realSize];
    }

    public static String show(ArrayQueueADT current) {
        String result = "Queue: ";

        for(int i = 0; i < current.currentSize; ++i) {
            result = result + String.valueOf(current.array[i]) + " ";
        }

        return result;
    }
}