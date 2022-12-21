package ru.maksim.ikbo2021.new_pracs.prac_29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class RestaurantOrder implements Order {
    MyDoubleList restaurantOrders = new MyDoubleList();

    public RestaurantOrder() {
    }

    public String[] getMenu() {
        String[] str = new String[this.restaurantOrders.size()];

        for(int i = 0; i < this.restaurantOrders.size(); ++i) {
            String var10002 = this.restaurantOrders.get(i).getName();
            str[i] = var10002 + " " + this.restaurantOrders.get(i).getDiscription() + " " + this.restaurantOrders.get(i).getCost();
        }

        return str;
    }

    public boolean add(Item item) {
        return this.restaurantOrders.add(item);
    }

    public boolean remove(String name) {
        return this.restaurantOrders.remove(name);
    }

    public int removeAll(String name) {
        int count = this.restaurantOrders.contains(name);

        while(this.restaurantOrders.contains(name) != 0) {
            this.remove(name);
        }

        return count;
    }

    public int getCount() {
        return this.restaurantOrders.size();
    }

    public ArrayList getArray() {
        return this.restaurantOrders.convertToAL();
    }

    public int getCost() {
        ArrayList<Item> al = this.restaurantOrders.convertToAL();
        int total = 0;

        Item item;
        for(Iterator var3 = al.iterator(); var3.hasNext(); total += item.getCost()) {
            item = (Item)var3.next();
        }

        return total;
    }

    public int getAmount(String name) {
        return this.restaurantOrders.contains(name);
    }

    public ArrayList getSortedArray() {
        ArrayList<Item> al = this.restaurantOrders.convertToAL();
        al.sort(Comparator.comparing(Item::getCost));
        return al;
    }
}