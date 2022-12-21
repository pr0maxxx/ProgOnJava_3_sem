package ru.maksim.ikbo2021.new_pracs.prac_30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class TableOrder implements Order {
    MyDoubleList restaurantOrders = new MyDoubleList();

    public TableOrder() {
    }

    public String[] getMenu() {
        String[] str = new String[this.restaurantOrders.size()];

        for(int i = 0; i < this.restaurantOrders.size(); ++i) {
            String var10002 = this.restaurantOrders.get(i).getName();
            str[i] = var10002 + " " + this.restaurantOrders.get(i).getDescription() + " " + this.restaurantOrders.get(i).getCost();
        }

        return str;
    }

    public ArrayList<MenuItem> getItems() {
        return this.restaurantOrders.convertToAL();
    }

    public boolean add(MenuItem item) {
        return this.restaurantOrders.add(item);
    }

    public String[] itemsNames() {
        String[] str = new String[this.restaurantOrders.size()];

        for(int i = 0; i < this.restaurantOrders.size(); ++i) {
            str[i] = this.restaurantOrders.get(i).getName();
        }

        return str;
    }

    public int itemsQuantity(String itemName) {
        return this.restaurantOrders.contains(itemName);
    }

    public int itemsQuantity(MenuItem item) {
        return this.restaurantOrders.contains(item);
    }

    public int itemsQuantity() {
        return this.restaurantOrders.size();
    }

    public boolean remove(String name) {
        return this.restaurantOrders.remove(name);
    }

    public boolean remove(MenuItem item) {
        return this.restaurantOrders.remove(item);
    }

    public int removeAll(String name) {
        int count = this.restaurantOrders.contains(name);

        while(this.restaurantOrders.contains(name) != 0) {
            this.remove(name);
        }

        return count;
    }

    public int removeAll(MenuItem item) {
        int count = this.restaurantOrders.contains(item);

        while(this.restaurantOrders.contains(item) != 0) {
            this.restaurantOrders.remove(item);
        }

        return count;
    }

    public ArrayList<MenuItem> sortedItemsByCostDesc() {
        ArrayList<MenuItem> al = this.restaurantOrders.convertToAL();
        al.sort(Comparator.comparing(MenuItem::getCost));
        return al;
    }

    public double costTotal() {
        ArrayList<MenuItem> al = this.restaurantOrders.convertToAL();
        int total = 0;

        MenuItem item;
        for(Iterator var3 = al.iterator(); var3.hasNext(); total += item.getCost()) {
            item = (MenuItem)var3.next();
        }

        return (double)total;
    }

    public Customer getCustomer() {
        return null;
    }

    public void setCustomer(Customer newCustomer) {
    }
}
