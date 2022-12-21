package ru.maksim.ikbo2021.new_pracs.prac_3.math_and_rand.ex_3;

public class FourRandom {
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++)
            arr[i] = (int)(Math.random() * 89) + 10;
        for(int i = 0; i < 4; i++)
            System.out.print(arr[i] + " ");
        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            if (arr[i] < arr[i + 1])
                continue;
            else {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.print("\nМассив является строго возрастающей последовательностью");
        else
            System.out.print("\nМассив не является строго возрастающей последовательностью");
    }
}
