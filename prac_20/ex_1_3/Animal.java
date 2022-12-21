package ru.maksim.ikbo2021.new_pracs.prac_20.ex_1_3;

public class Animal {
    private Integer iAge;
    private String stName;

    public Animal(Integer iAge, String stName) {
        this.iAge = iAge;
        this.stName = stName;
    }

    public Integer getAge() {
        return this.iAge;
    }

    public void setAge(Integer iAge) {
        this.iAge = iAge;
    }

    public String getName() {
        return this.stName;
    }

    public void setName(String stName) {
        this.stName = stName;
    }
}
