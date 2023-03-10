package ru.maksim.ikbo2021.new_pracs.prac_32;


import java.io.Serializable;

public interface OrdersManager extends Serializable {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();


}
