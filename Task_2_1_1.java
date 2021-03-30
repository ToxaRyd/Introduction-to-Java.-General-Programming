package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int x=0, k;
        int [] n = new int[] {10, 15, 24, 37, 45, 12, 87, 123123, 98, 777};

        System.out.print("Введите число К: ");
        k = num.nextInt();

        for (int i = 0; i < 10; i++) {
            if ((n[i]%k) == 0) x += n[i];
        }

        System.out.println("Сумма чисел, кратных заданному К=" + k + ", равна: " + x);
    }
}
