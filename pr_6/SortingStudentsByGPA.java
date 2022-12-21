package ru.maksim.ikbo2021.pracs.pr_6;

public class SortingStudentsByGPA implements Comparator {
    private Student array_students[];

    public SortingStudentsByGPA(Student[] students) {
        this.array_students = students;
    }

    public Student[] getArray_students() {
        return array_students;
    }

    public void setArray_students(Student[] array_students) {
        this.array_students = array_students;
    }

    @Override
    public void quick_sort_interface(int begin, int end) {
        if (array_students.length == 0) return;
        if (begin >= end) return;

        int middle = begin + (end - begin) / 2;
        Student main_element = array_students[middle];

        int i = begin, j = end;
        while (i <= j) {
            while (array_students[i].getGPA() < main_element.getGPA()) {
                i++;
            }

            while (array_students[j].getGPA() > main_element.getGPA()) {
                j--;
            }

            if (i <= j) {
                Student temp = array_students[i];
                array_students[i] = array_students[j];
                array_students[j] = temp;
                i++;
                j--;
            }
        }

        if (begin < j)
            quick_sort_interface(begin, j);

        if (end > i)
            quick_sort_interface(i, end);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < array_students.length; i++){
            s += array_students[i].getGPA();
            s += "\n";
        }
        return s;
    }
}