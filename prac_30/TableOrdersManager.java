package ru.maksim.ikbo2021.new_pracs.prac_30;

import java.util.ArrayList;
import java.util.Iterator;

public class TableOrdersManager implements OrdersManager {
    Order[] orders;
    int maxTables;

    TableOrdersManager(int maxTables) {
        this.maxTables = maxTables;
        this.orders = new Order[maxTables];
    }

    public void add(Order order, int TableNumber) {
        if (TableNumber < this.orders.length && TableNumber > 0 && this.orders[TableNumber] == null) {
            this.orders[TableNumber] = order;
        }

    }

    public void addItem(MenuItem item, int TableNumber) {
        if (TableNumber < this.orders.length && TableNumber > 0) {
            this.orders[TableNumber].add(item);
        }

    }

    public Order getOrder(int TableNumber) {
        return TableNumber < this.orders.length && TableNumber > 0 ? this.orders[TableNumber] : null;
    }

    public int freeTableNumber() {
        for(int i = 0; i < this.orders.length; ++i) {
            if (this.orders[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public int[] freeTableNumbers() {
        ArrayList<Integer> al = new ArrayList();

        for(int i = 0; i < this.orders.length; ++i) {
            if (this.orders[i] == null) {
                al.add(i);
            }
        }

        return al.stream().mapToInt((ix) -> {
            return ix;
        }).toArray();
    }

    public void remove(int TableNumber) {
        if (TableNumber < this.orders.length && TableNumber > 0) {
            this.orders[TableNumber] = null;
        }

    }

    public void removeAll(Order order) {
        int i = 0;
        Order[] var3 = this.orders;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Order orderTmp = var3[var5];
            if (order == orderTmp) {
                this.orders[i] = null;
            }

            ++i;
        }

    }

    public void remove(Order order) {
        int i = 0;
        Order[] var3 = this.orders;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Order orderTmp = var3[var5];
            if (order == orderTmp) {
                this.orders[i] = null;
                return;
            }

            ++i;
        }

    }

    public int itemsQuantity(String itemName) {
        int total = 0;
        Order[] var3 = this.orders;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Order order = var3[var5];
            Iterator var7 = order.getItems().iterator();

            while(var7.hasNext()) {
                MenuItem item = (MenuItem)var7.next();
                if (item.getName() == itemName) {
                    ++total;
                }
            }
        }

        return total;
    }

    public int itemsQuantity(MenuItem item) {
        int total = 0;
        Order[] var3 = this.orders;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Order order = var3[var5];
            Iterator var7 = order.getItems().iterator();

            while(var7.hasNext()) {
                MenuItem menuItem = (MenuItem)var7.next();
                if (menuItem == item) {
                    ++total;
                }
            }
        }

        return total;
    }

    public Order[] getOrders() {
        return this.orders;
    }

    public int ordersCostSummary() {
        int total = 0;
        Order[] var2 = this.orders;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Order order = var2[var4];

            MenuItem item;
            for(Iterator var6 = order.getItems().iterator(); var6.hasNext(); total += item.getCost()) {
                item = (MenuItem)var6.next();
            }
        }

        return total;
    }

    public int ordersQuantity() {
        return this.orders.length;
    }
}
