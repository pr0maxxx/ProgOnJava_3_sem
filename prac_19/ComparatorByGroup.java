package ru.maksim.ikbo2021.new_pracs.prac_19;

import java.util.Comparator;

public class ComparatorByGroup implements Comparator<Student> {
    public int compare(Student first, Student second) {
        return first.getGroup().compareTo(second.getGroup());
    }
}
