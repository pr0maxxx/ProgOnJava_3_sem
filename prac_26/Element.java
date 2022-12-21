package ru.maksim.ikbo2021.new_pracs.prac_26;

public class Element {
    int Key;
    String value;
    Element next = null;

    Element(int iKey, String value) {
        this.Key = iKey;
        this.value = value;
    }

    public void addNext(Element next) {
        this.next = next;
    }

    public String toString() {
        return "Element: " + this.Key + " " + this.value;
    }
}
