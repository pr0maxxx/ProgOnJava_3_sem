package ru.maksim.ikbo2021.new_pracs.prac_10;

import java.util.Random;

public class Tester {
    public Tester() {
    }

    public static void main(String[] args) {
        Student[] StudentsList = new Student[10];
        Student[] StudentsListFirst = new Student[10];
        Student[] StudentsListSecond = new Student[10];
        System.out.println("\nFirst quick sort:\n");
        System.out.println("Basic array: \n");
        setArray(StudentsList, 10, 1);
        outArray(StudentsList);
        quickSort(0, 9, StudentsList);
        System.out.println("\nSorted array: \n");
        outArray(StudentsList);
        System.out.println("\nSecond merge sort:\n");
        System.out.println("Basic array: \n");
        setArray(StudentsList, 10, 1);
        outArray(StudentsList);
        System.out.println("\nSorted array: \n");
        outArray(mergeSort(StudentsList));
        System.out.println("\nThird quick sort another comparator:\n");
        System.out.println("Basic array: \n");
        setArray(StudentsList, 10, 2);
        outArray(StudentsList);
        quickSort(0, 9, StudentsList);
        System.out.println("\nSorted array: \n");
        outArray(StudentsList);
        System.out.println("\nFourth merging to arrays:\n");
        System.out.println("Basic arrays: \n");
        setArray(StudentsListFirst, 10, 1);
        setArray(StudentsListSecond, 10, 1);
        System.out.println("\nFirst array:");
        outArray(StudentsListFirst);
        System.out.println("\nSecond array: ");
        outArray(StudentsListSecond);
        quickSort(0, 9, StudentsListFirst);
        quickSort(0, 9, StudentsListSecond);
        System.out.println("\nSorted arrays: \n");
        outArray(mergeArrays(StudentsListFirst, StudentsListSecond));
    }

    private static Student[] mergeSort(Student[] StudentsList) {
        if (StudentsList == null) {
            return null;
        } else if (StudentsList.length < 2) {
            return StudentsList;
        } else {
            Student[] StudentsListLeft = new Student[StudentsList.length / 2];
            System.arraycopy(StudentsList, 0, StudentsListLeft, 0, StudentsList.length / 2);
            Student[] StudentsListRight = new Student[StudentsList.length - StudentsList.length / 2];
            System.arraycopy(StudentsList, StudentsList.length / 2, StudentsListRight, 0, StudentsList.length - StudentsList.length / 2);
            StudentsListLeft = mergeSort(StudentsListLeft);
            StudentsListRight = mergeSort(StudentsListRight);
            return mergeArrays(StudentsListLeft, StudentsListRight);
        }
    }

    private static Student[] mergeArrays(Student[] StudentsListLeft, Student[] StudentsListRight) {
        Student[] StudentsListFinal = new Student[StudentsListLeft.length + StudentsListRight.length];
        int posLeft = 0;
        int posRight = 0;

        int curPos;
        for(curPos = 0; posLeft < StudentsListLeft.length && posRight < StudentsListRight.length; StudentsListFinal[curPos++] = StudentsListLeft[posLeft].compareTo(StudentsListRight[posRight]) > 0 ? StudentsListLeft[posLeft++] : StudentsListRight[posRight++]) {
        }

        if (posLeft < StudentsListLeft.length) {
            System.arraycopy(StudentsListLeft, posLeft, StudentsListFinal, curPos, StudentsListLeft.length - posLeft);
        } else if (posRight < StudentsListRight.length) {
            System.arraycopy(StudentsListRight, posRight, StudentsListFinal, curPos, StudentsListRight.length - posRight);
        }

        return StudentsListFinal;
    }

    public static void quickSort(int low, int high, Student[] StudentsList) {
        if (StudentsList.length != 0) {
            if (low < high) {
                Student basePoint = StudentsList[low + (high - low) / 2];
                int i = low;
                int j = high;

                while(i <= j) {
                    while(StudentsList[i].compareTo(basePoint) > 0) {
                        ++i;
                    }

                    while(StudentsList[j].compareTo(basePoint) < 0) {
                        --j;
                    }

                    if (i <= j) {
                        Student temp = StudentsList[i];
                        StudentsList[i] = StudentsList[j];
                        StudentsList[j] = temp;
                        ++i;
                        --j;
                    }
                }

                if (low < j) {
                    quickSort(low, j, StudentsList);
                }

                if (high > i) {
                    quickSort(i, high, StudentsList);
                }

            }
        }
    }

    public static void setArray(Student[] StudentsList, int iLength, int iComparator) {
        for(int i = 0; i < iLength; ++i) {
            StudentsList[i] = new Student("TMP Name", "TMP surname", "TMP speciality", i % 6 + 1, "TMP group", (new Random()).nextInt(0, 100), iComparator);
        }

    }

    public static void outArray(Student[] StudentsList) {
        for(int i = 0; i < StudentsList.length; ++i) {
            System.out.println(StudentsList[i]);
        }

    }
}
