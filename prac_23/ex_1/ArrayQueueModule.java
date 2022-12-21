package ru.maksim.ikbo2021.new_pracs.prac_23.ex_1;

public class ArrayQueueModule {
    private static int currentSize = 0;
    private static int realSize = 8;
    private static Object[] array;

    public ArrayQueueModule() {
        array = new Object[realSize];
        currentSize = 0;
    }

    private static void increaseRealSize(int newSize) {
        if (newSize >= array.length) {
            realSize = newSize;
            Object[] tmp = new Object[realSize];
            System.arraycopy(array, 0, tmp, 0, currentSize);
            array = tmp;
        }
    }

    public static void enqueue(Object newElement) {
        if (newElement != null) {
            if ((double)(array.length + 1) >= (double)realSize * 0.75D) {
                increaseRealSize(realSize * 2);
            }

            array[currentSize++] = newElement;
        }
    }

    public static Object element() {
        return isEmpty() ? null : array[0];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Object[] tmp = new Object[realSize];
            Object firstElement = array[0];
            System.arraycopy(array, 0, tmp, 0, currentSize--);
            array = tmp;
            return firstElement;
        }
    }

    public static int size() {
        return currentSize;
    }

    public static boolean isEmpty() {
        return currentSize == 0;
    }

    public static void clear() {
        currentSize = 0;
        realSize = 8;
        array = new Object[realSize];
    }

    public static String show() {
        String result = "Queue: ";

        for(int i = 0; i < currentSize; ++i) {
            result = result + String.valueOf(array[i]) + " ";
        }

        return result;
    }
}
