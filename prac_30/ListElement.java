package ru.maksim.ikbo2021.new_pracs.prac_30;

public class ListElement {
    MenuItem item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(MenuItem item, ListElement parent) {
        this.item = item;
        this.prevItem = parent;
    }
}
