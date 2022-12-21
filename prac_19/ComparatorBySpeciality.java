package ru.maksim.ikbo2021.new_pracs.prac_19;


import java.util.Comparator;

public class ComparatorBySpeciality implements Comparator<Student> {
    public int compare(Student first, Student second) {
        return first.getSpeciality().compareTo(second.getSpeciality());
    }
}