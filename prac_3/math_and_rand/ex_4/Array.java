package ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_4;

import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        System.out.print("Введите n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 11) //число подходящее, если оно больше 10
        {
            System.out.print("Число не подходит. Повторите ввод: ");
            Scanner source = new Scanner(System.in);
            n = source.nextInt();
        }
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = (int)(Math.random() * n);
        System.out.print("Сгенерированный массив: ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\nМассив только из четных элементов: ");
        for(int i = 0; i < n; i++)
            if(arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
    }
}
