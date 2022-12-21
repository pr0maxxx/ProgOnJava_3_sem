package ru.maksim.ikbo2021.new_pracs.prac_30;

public class QueueNode {
    QueueNode next;
    QueueNode prev;
    Order value;
    Customer customer;

    QueueNode(Order value, Customer customer, QueueNode prev) {
        this.prev = prev;
        this.value = value;
        this.customer = customer;
        this.next = null;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
