package ru.maksim.ikbo2021.new_pracs.prac_30;

import java.util.ArrayList;

public interface Order {
    boolean add(MenuItem var1);

    String[] itemsNames();

    int itemsQuantity(String var1);

    int itemsQuantity(MenuItem var1);

    int itemsQuantity();

    String[] getMenu();

    ArrayList<MenuItem> getItems();

    boolean remove(String var1);

    boolean remove(MenuItem var1);

    int removeAll(String var1);

    int removeAll(MenuItem var1);

    ArrayList<MenuItem> sortedItemsByCostDesc();

    double costTotal();

    Customer getCustomer();

    void setCustomer(Customer var1);
}