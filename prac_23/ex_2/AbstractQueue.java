package ru.maksim.ikbo2021.new_pracs.prac_23.ex_2;

public abstract class AbstractQueue implements Queue {
    private int size = 0;

    protected abstract void enquequeExecute(Object var1);

    protected abstract Object elementExecute();

    protected abstract Object dequeueExecute();

    protected abstract String showExecute();

    public void enqueue(Object element) {
        if (element != null) {
            ++this.size;
            this.enquequeExecute(element);
        }
    }

    public Object element() {
        return this.size == 0 ? null : this.elementExecute();
    }

    public Object dequeue() {
        return this.size-- == 0 ? null : this.dequeueExecute();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        while(!this.isEmpty()) {
            this.dequeue();
        }

    }

    public String show() {
        return this.showExecute();
    }
}