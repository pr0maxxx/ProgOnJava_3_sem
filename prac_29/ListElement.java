package ru.maksim.ikbo2021.new_pracs.prac_29;

public class ListElement {
    Item item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(Item item, ListElement parent) {
        this.item = item;
        this.prevItem = parent;
    }
}