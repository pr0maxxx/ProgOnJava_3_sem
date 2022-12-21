package ru.maksim.ikbo2021.new_pracs.prac_29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class InternetOrder implements Order {
    MyDoubleList internetOrders = new MyDoubleList();

    InternetOrder() {
    }

    public void getOrder(ArrayList<Item> order) {
        Iterator var2 = order.iterator();

        while(var2.hasNext()) {
            Item item = (Item)var2.next();
            this.internetOrders.add(item);
        }

    }

    public String[] getMenu() {
        String[] str = new String[this.internetOrders.size()];

        for(int i = 0; i < this.internetOrders.size(); ++i) {
            String var10002 = this.internetOrders.get(i).getName();
            str[i] = var10002 + " " + this.internetOrders.get(i).getDiscription() + " " + this.internetOrders.get(i).getCost();
        }

        return str;
    }

    public boolean add(Item item) {
        return this.internetOrders.add(item);
    }

    public boolean remove(String name) {
        return this.internetOrders.remove(name);
    }

    public int removeAll(String name) {
        int count = this.internetOrders.contains(name);

        while(this.internetOrders.contains(name) != 0) {
            this.remove(name);
        }

        return count;
    }

    public int getCount() {
        return this.internetOrders.size();
    }

    public ArrayList getArray() {
        return this.internetOrders.convertToAL();
    }

    public int getCost() {
        ArrayList<Item> al = this.internetOrders.convertToAL();
        int total = 0;

        Item item;
        for(Iterator var3 = al.iterator(); var3.hasNext(); total += item.getCost()) {
            item = (Item)var3.next();
        }

        return total;
    }

    public int getAmount(String name) {
        return this.internetOrders.contains(name);
    }

    public ArrayList getSortedArray() {
        ArrayList<Item> al = this.internetOrders.convertToAL();
        al.sort(Comparator.comparing(Item::getCost));
        return al;
    }
}
