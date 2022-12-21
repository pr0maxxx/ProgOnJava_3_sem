package ru.maksim.ikbo2021.new_pracs.prac_23.ex_2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {
    private LinkedList<Object> queue = new LinkedList();

    public LinkedQueue() {
    }

    protected void enquequeExecute(Object element) {
        this.queue.add(element);
    }

    protected Object elementExecute() {
        return this.queue.getFirst();
    }

    protected Object dequeueExecute() {
        return this.queue.removeFirst();
    }

    protected String showExecute() {
        String tmp = "LinkedQueue: ";

        Object element;
        for(Iterator var2 = this.queue.iterator(); var2.hasNext(); tmp = tmp + element.toString() + " ") {
            element = var2.next();
        }

        return tmp;
    }
}