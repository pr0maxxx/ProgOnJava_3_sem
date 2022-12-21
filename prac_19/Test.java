package ru.maksim.ikbo2021.new_pracs.prac_19;

import java.util.ArrayList;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        ArrayList<Student> alStudents = new ArrayList();
        alStudents.add(new Student("Viktor", "Viktorov", "Designer", 3, "IIII-21-21", 4));
        alStudents.add(new Student("Gena", "Genov", "Drawer", 4, "IIII-20-22", 5));
        new LabClassUI(alStudents);
    }
}
