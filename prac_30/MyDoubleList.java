package ru.maksim.ikbo2021.new_pracs.prac_30;

import java.util.ArrayList;

public class MyDoubleList {
    ListElement head = null;

    public MyDoubleList() {
    }

    public int size() {
        if (this.head == null) {
            return 0;
        } else {
            int count = 0;

            for(ListElement tmp = this.head; tmp != null; ++count) {
                tmp = tmp.nextItem;
            }

            return count;
        }
    }

    public boolean add(MenuItem item) {
        if (this.head == null) {
            this.head = new ListElement(item, (ListElement)null);
            return true;
        } else {
            ListElement tmp;
            for(tmp = this.head; tmp.nextItem != null; tmp = tmp.nextItem) {
            }

            tmp.nextItem = new ListElement(item, tmp);
            return true;
        }
    }

    public boolean remove(String name) {
        ListElement tmp = this.head;
        if (this.head != null && this.head.item.getName() == name) {
            this.head = this.head.nextItem;
        }

        while(tmp.nextItem != null && tmp.item.getName() != name) {
            tmp = tmp.nextItem;
        }

        if (tmp == null) {
            return false;
        } else {
            if (tmp.nextItem != null && tmp.prevItem != null) {
                ListElement prev = tmp.prevItem;
                ListElement next = tmp.nextItem;
                prev.nextItem = tmp.nextItem;
                next.prevItem = tmp.prevItem;
            } else if (tmp.prevItem != null) {
                tmp.prevItem.nextItem = null;
            }

            return true;
        }
    }

    public boolean remove(MenuItem item) {
        ListElement tmp = this.head;
        if (this.head != null && this.head.item == item) {
            this.head = this.head.nextItem;
        }

        while(tmp.nextItem != null && tmp.item != item) {
            tmp = tmp.nextItem;
        }

        if (tmp == null) {
            return false;
        } else {
            if (tmp.nextItem != null && tmp.prevItem != null) {
                ListElement prev = tmp.prevItem;
                ListElement next = tmp.nextItem;
                prev.nextItem = tmp.nextItem;
                next.prevItem = tmp.prevItem;
            } else if (tmp.prevItem != null) {
                tmp.prevItem.nextItem = null;
            }

            return true;
        }
    }

    public int contains(MenuItem item) {
        ListElement tmp = this.head;
        int count = 0;

        while(true) {
            while(tmp != null) {
                if (item.getCost() == tmp.item.getCost() && item.getName() == tmp.item.getName() && item.getDescription() == tmp.item.getDescription()) {
                    ++count;
                    tmp = tmp.nextItem;
                } else {
                    tmp = tmp.nextItem;
                }
            }

            return count;
        }
    }

    public int contains(String name) {
        ListElement tmp = this.head;
        int count = 0;

        while(tmp != null) {
            if (name == tmp.item.getName()) {
                ++count;
                tmp = tmp.nextItem;
            } else {
                tmp = tmp.nextItem;
            }
        }

        return count;
    }

    public ArrayList<MenuItem> convertToAL() {
        ArrayList<MenuItem> result = new ArrayList();

        for(ListElement tmp = this.head; tmp != null; tmp = tmp.nextItem) {
            result.add(tmp.item);
        }

        return result;
    }

    public MenuItem get(int i) {
        if (i > this.size()) {
            return null;
        } else {
            int count = 0;

            ListElement tmp;
            for(tmp = this.head; tmp != null && count++ != i; tmp = tmp.nextItem) {
            }

            return tmp != null ? tmp.item : null;
        }
    }
}
