package ru.maksim.ikbo2021.new_pracs.prac_30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class InternetOrder implements Order {
    MyDoubleList InternetOrder = new MyDoubleList();

    public InternetOrder() {
    }

    public String[] getMenu() {
        String[] str = new String[this.InternetOrder.size()];

        for(int i = 0; i < this.InternetOrder.size(); ++i) {
            String var10002 = this.InternetOrder.get(i).getName();
            str[i] = var10002 + " " + this.InternetOrder.get(i).getDescription() + " " + this.InternetOrder.get(i).getCost();
        }

        return str;
    }

    public ArrayList<MenuItem> getItems() {
        return this.InternetOrder.convertToAL();
    }

    public boolean add(MenuItem item) {
        return this.InternetOrder.add(item);
    }

    public String[] itemsNames() {
        String[] str = new String[this.InternetOrder.size()];

        for(int i = 0; i < this.InternetOrder.size(); ++i) {
            str[i] = this.InternetOrder.get(i).getName();
        }

        return str;
    }

    public int itemsQuantity(String itemName) {
        return this.InternetOrder.contains(itemName);
    }

    public int itemsQuantity(MenuItem item) {
        return this.InternetOrder.contains(item);
    }

    public int itemsQuantity() {
        return this.InternetOrder.size();
    }

    public boolean remove(String name) {
        return this.InternetOrder.remove(name);
    }

    public boolean remove(MenuItem item) {
        return this.InternetOrder.remove(item);
    }

    public int removeAll(String name) {
        int count = this.InternetOrder.contains(name);

        while(this.InternetOrder.contains(name) != 0) {
            this.remove(name);
        }

        return count;
    }

    public int removeAll(MenuItem item) {
        int count = this.InternetOrder.contains(item);

        while(this.InternetOrder.contains(item) != 0) {
            this.InternetOrder.remove(item);
        }

        return count;
    }

    public ArrayList<MenuItem> sortedItemsByCostDesc() {
        ArrayList<MenuItem> al = this.InternetOrder.convertToAL();
        al.sort(Comparator.comparing(MenuItem::getCost));
        return al;
    }

    public double costTotal() {
        ArrayList<MenuItem> al = this.InternetOrder.convertToAL();
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
