package ru.maksim.ikbo2021.pracs.pr_6;

public class Student {
    private int iDNumber;
    private int GPA;

    public Student(int iDNumber, int GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}