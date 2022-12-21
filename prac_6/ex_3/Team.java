package ru.maksim.ikbo2021.new_pracs.prac_6.ex_3;

class Team implements  Nameable{
    String title;
    int yearOfFoundation;

    public Team(String title, int yearOfFoundation){
        this.title = title;
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getName() {
        return title;
    }
}