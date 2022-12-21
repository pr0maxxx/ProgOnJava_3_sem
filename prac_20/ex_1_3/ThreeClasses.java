package ru.maksim.ikbo2021.new_pracs.prac_20.ex_1_3;

import java.io.PrintStream;
import java.io.Serializable;

public class ThreeClasses<T extends Comparable, V extends Serializable, K extends Animal> {
    private T tObject;
    private V vObject;
    private K kObject;

    public ThreeClasses(T tObject, V vObject, K kObject) {
        this.tObject = tObject;
        this.vObject = vObject;
        this.kObject = kObject;
    }

    public T getTObject() {
        return this.tObject;
    }

    public void setTObject(T tObject) {
        this.tObject = tObject;
    }

    public V getVObject() {
        return this.vObject;
    }

    public void setVObject(V vObject) {
        this.vObject = vObject;
    }

    public K getKObject() {
        return this.kObject;
    }

    public void setKObject(K kObject) {
        this.kObject = kObject;
    }

    public void showClassesName() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.tObject.getClass());
        var10000.println("T: " + var10001 + " V: " + String.valueOf(this.vObject.getClass()) + " K: " + String.valueOf(this.kObject.getClass()));
    }
}
