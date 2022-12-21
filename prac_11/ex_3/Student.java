package ru.maksim.ikbo2021.new_pracs.prac_11.ex_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer iDNumber;
    private Double GPAScore;
    private Date dateOfBirth;
    private SimpleDateFormat dateFormatter;

    public Student(int iDNumber, double GPAScore, String dateOfBirth, int iDateFormat) throws ParseException {
        this.GPAScore = GPAScore;
        this.iDNumber = iDNumber;
        this.dateOfBirth = (new SimpleDateFormat("dd.MM.yyyy")).parse(dateOfBirth);
        switch(iDateFormat) {
            case 1:
                this.dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
                break;
            case 2:
                this.dateFormatter = new SimpleDateFormat("EEEE, d MMMM , yyyy");
                break;
            case 3:
                this.dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        }

    }

    public int compareTo(Student second) {
        return Objects.equals(this.GPAScore, second.GPAScore) ? this.iDNumber - second.iDNumber : (int)(Math.ceil(this.GPAScore) - Math.ceil(second.GPAScore));
    }

    public String toString() {
        Integer var10000 = this.iDNumber;
        return "Student " + var10000 + ",GPA score: " + Math.ceil(this.GPAScore) + ",date of birth: " + this.dateFormatter.format(this.dateOfBirth);
    }
}
