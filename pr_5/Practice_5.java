package ru.maksim.ikbo2021.pracs.pr_5;

public class Practice_5 {
    //3
    public static void print(int a, int b)
    {
        if (a == b) return;
        if (a < b)
        {
            print(a, b - 1);
            System.out.println(b);
        }
        else
        {
            System.out.println(a);
            print(a - 1, b);
        }
    }
    //4
    public static int recursion(int len, int sum, int k, int s)
    {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
    //5
    public static int summa(int n) {
        if (n < 10) return n;
        else return n % 10 + summa(n / 10);

    }


    public static void main(String[] args) {
        print(5,10);
        System.out.println("----------");
        System.out.println(recursion(0,0,3,15));
        System.out.println("----------");
        System.out.println(summa(122));
    }
}
