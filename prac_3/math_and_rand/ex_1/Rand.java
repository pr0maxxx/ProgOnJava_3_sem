package ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_1;

import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        float[] arr = new float[len];
        //Random random = new Random(); //заполнение с помощью класса Random
        //for(int i = 0; i < len; i++)
        //    arr[i] = random.nextFloat(100);
        for(int i = 0; i < len; i++) //заполнение с помощью класса Math
            arr[i] = (float)(Math.random() * 100);
        for(int i = 0; i < len; i++)
            System.out.println(arr[i]);
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < len; i++) {
                if (arr[i] < arr[i - 1]) {
                    float temp;
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for(int i = 0; i < len; i++)
            System.out.println(arr[i]);
    }
}
