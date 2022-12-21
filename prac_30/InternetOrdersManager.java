package ru.maksim.ikbo2021.new_pracs.prac_30;

public class InternetOrdersManager implements OrdersManager {
    QueueNode head = null;
    QueueNode tail = null;
    Integer size = 0;

    public InternetOrdersManager() {
    }

    public int itemsQuantity(String itemName) {
        QueueNode tmp = this.head;

        int total;
        for(total = 0; tmp != null; tmp = tmp.next) {
            total += tmp.value.getItems().stream().mapToInt((obj) -> {
                return obj.getName() == itemName ? 1 : 0;
            }).sum();
        }

        return total;
    }

    public int itemsQuantity(MenuItem item) {
        QueueNode tmp = this.head;

        int total;
        for(total = 0; tmp != null; tmp = tmp.next) {
            total += tmp.value.getItems().stream().mapToInt((obj) -> {
                return obj == item ? 1 : 0;
            }).sum();
        }

        return total;
    }

    public Order[] getOrders() {
        Order[] orders = new Order[this.size];
        QueueNode tmp = this.head;

        for(int var3 = 0; tmp != null; tmp = tmp.next) {
            orders[var3++] = tmp.value;
        }

        return orders;
    }

    public int ordersCostSummary() {
        QueueNode tmp = this.head;

        int total;
        for(total = 0; tmp != null; tmp = tmp.next) {
            total += tmp.value.getItems().stream().mapToInt(MenuItem::getCost).sum();
        }

        return total;
    }

    public int ordersQuantity() {
        QueueNode tmp = this.head;

        int count;
        for(count = 0; tmp != null; ++count) {
        }

        return count;
    }

    public boolean add(Order order, Customer customer) {
        Integer var3 = this.size;
        this.size = this.size + 1;
        if (this.head == null) {
            this.head = new QueueNode(order, customer, (QueueNode)null);
            this.tail = this.head;
        } else {
            this.tail.next = new QueueNode(order, customer, this.tail);
            this.tail = this.tail.next;
        }

        return true;
    }

    public Order remove() {
        Integer var1 = this.size;
        this.size = this.size - 1;
        QueueNode tmp = this.head;
        if (this.head.next != null) {
            this.head = this.head.next;
        } else {
            this.head = null;
            this.tail = null;
        }

        return tmp.value;
    }

    public Order order() {
        return this.head.value;
    }
}