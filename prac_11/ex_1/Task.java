package ru.maksim.ikbo2021.new_pracs.prac_11.ex_1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    private String stDeveloperName;
    private Date startDate;
    private Date endDate;

    public Task(String stDeveloperName, Date startDate) {
        this.stDeveloperName = stDeveloperName;
        this.startDate = startDate;
    }

    public String getDeveloperName() {
        return this.stDeveloperName;
    }

    public void setDeveloperName(String stDeveloperName) {
        this.stDeveloperName = stDeveloperName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        String var10000 = this.stDeveloperName;
        return "Developer: " + var10000 + " started at: " + (new SimpleDateFormat("E yyyy - MM - dd")).format(this.startDate) + " ended at: " + (new SimpleDateFormat("E yyyy - MM - dd")).format(this.endDate) + " time: " + (this.endDate.getTime() - this.startDate.getTime()) / 3600000L + " hours";
    }
}

