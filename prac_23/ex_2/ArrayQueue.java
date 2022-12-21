package ru.maksim.ikbo2021.new_pracs.prac_23.ex_2;

public class ArrayQueue extends AbstractQueue {
    private Object[] array;
    private int realSize = 8;
    private int currentSize = 0;

    public ArrayQueue() {
        this.array = new Object[this.realSize];
    }

    private void increaseRealSize(int newSize) {
        if (newSize >= this.array.length) {
            this.realSize = newSize;
            Object[] tmp = new Object[this.realSize];
            System.arraycopy(this.array, 0, tmp, 0, this.array.length);
            this.array = tmp;
        }
    }

    protected void enquequeExecute(Object element) {
        if ((double)(this.currentSize + 1) > (double)this.realSize * 0.75D) {
            this.increaseRealSize(this.realSize * 2);
        }

        this.array[this.currentSize++] = element;
    }

    protected Object dequeueExecute() {
        Object[] tmp = new Object[this.realSize];
        Object firstElement = this.array[0];
        System.arraycopy(this.array, 0, tmp, 0, this.currentSize--);
        this.array = tmp;
        return firstElement;
    }

    protected Object elementExecute() {
        return this.array[0];
    }

    protected String showExecute() {
        String tmp = "ArrayQueue: ";
        Object[] var2 = this.array;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Object element = var2[var4];
            tmp = tmp + element.toString() + " ";
        }

        return tmp;
    }
}
