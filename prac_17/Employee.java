package ru.maksim.ikbo2021.new_pracs.prac_17;

public class Employee {
    String stName;
    Integer iHours;
    Integer iHourPayment;

    public Employee() {
    }

    public Integer getHourPayment() {
        return this.iHourPayment;
    }

    public void setHourPayment(Integer iHourPayment) {
        this.iHourPayment = iHourPayment;
    }

    public String getName() {
        return this.stName;
    }

    public void setName(String stName) {
        this.stName = stName;
    }

    public Integer getHours() {
        return this.iHours;
    }

    public void setHours(Integer iHours) {
        this.iHours = iHours;
    }

    public Integer getSalary() {
        return this.iHourPayment * this.iHours;
    }
}
