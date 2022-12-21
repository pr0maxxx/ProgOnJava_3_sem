package ru.maksim.ikbo2021.new_pracs.prac_30;

public interface OrdersManager {
    int itemsQuantity(String var1);

    int itemsQuantity(MenuItem var1);

    Order[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}
