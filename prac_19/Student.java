package ru.maksim.ikbo2021.new_pracs.prac_19;


public class Student {
    private String stName;
    private String stSurname;
    private String stSpeciality;
    private Integer iCourse;
    private Integer GPAScore = 0;
    private String stGroup;

    public Student(String stName, String stSurname, String stSpeciality, Integer iCourse, String stGroup, Integer GPAScore) {
        this.stName = stName;
        this.stSurname = stSurname;
        this.stSpeciality = stSpeciality;
        this.iCourse = iCourse;
        this.stGroup = stGroup;
        this.GPAScore = GPAScore;
    }

    public String getName() {
        return this.stName;
    }

    public void setName(String stName) {
        this.stName = stName;
    }

    public String getSurname() {
        return this.stSurname;
    }

    public void setSurname(String stSurname) {
        this.stSurname = stSurname;
    }

    public String getSpeciality() {
        return this.stSpeciality;
    }

    public void setSpeciality(String stSpeciality) {
        this.stSpeciality = stSpeciality;
    }

    public Integer getCourse() {
        return this.iCourse;
    }

    public void setCourse(Integer iCourse) {
        this.iCourse = iCourse;
    }

    public String getGroup() {
        return this.stGroup;
    }

    public void setGroup(String stGroup) {
        this.stGroup = stGroup;
    }

    public Integer getGPAScore() {
        return this.GPAScore;
    }

    public void setGPAScore(Integer GPAScore) {
        this.GPAScore = GPAScore;
    }

    public String toString() {
        return "Student: " + this.stName + ", " + this.stSurname + ", " + this.stGroup + ", " + this.stSpeciality + ", " + this.iCourse + ", " + this.GPAScore;
    }
}