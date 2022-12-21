package ru.maksim.ikbo2021.new_pracs.prac_19;

import java.util.Comparator;

public class CompareByGpa implements Comparator<Student> {
    public int compare(Student first, Student second) {
        return first.getGPAScore() - second.getGPAScore();
    }
}
