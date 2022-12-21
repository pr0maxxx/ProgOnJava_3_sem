package ru.maksim.ikbo2021.new_pracs.prac_23.ex_1;

public class ArrayQueue {
    private int curentSize = 0;
    private int realSize = 8;
    private Object[] array;

    public ArrayQueue() {
        this.array = new Object[this.realSize];
        this.curentSize = 0;
    }

    private void increaseRealSize(int newSize) {
        if (newSize >= this.array.length) {
            this.realSize = newSize;
            Object[] tmp = new Object[this.realSize];
            System.arraycopy(this.array, 0, tmp, 0, this.curentSize);
            this.array = tmp;
        }
    }

    public void enqueue(Object newElement) {
        if (newElement != null) {
            if ((double)(this.array.length + 1) >= (double)this.realSize * 0.75D) {
                this.increaseRealSize(this.realSize * 2);
            }

            this.array[this.curentSize++] = newElement;
        }
    }

    public Object element() {
        return this.isEmpty() ? null : this.array[0];
    }

    public Object dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            Object[] tmp = new Object[this.realSize];
            Object firstElement = this.array[0];
            System.arraycopy(this.array, 0, tmp, 0, this.curentSize);
            --this.curentSize;
            this.array = tmp;
            return firstElement;
        }
    }

    public int size() {
        return this.curentSize;
    }

    public boolean isEmpty() {
        return this.curentSize == 0;
    }

    public void clear() {
        this.curentSize = 0;
        this.realSize = 8;
        this.array = new Object[this.realSize];
    }

    public String show() {
        String result = "Queue: ";

        for(int i = 0; i < this.curentSize; ++i) {
            result = result + String.valueOf(this.array[i]) + " ";
        }

        return result;
    }
}
