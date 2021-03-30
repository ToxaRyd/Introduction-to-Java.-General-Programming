package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int k, l=0;
        int [] n = new int[] {10, 15, 24, 37, 45, 12, 87, 123123, 98, 777};

        System.out.print("Введите число Z: ");
        k = num.nextInt();

        for (int i = 0; i < 10; i++) {
            if (n[i] > k) {
                n[i] = k;
                l++;
            }
        }

        System.out.println("Число замен = " + l);
    }
}
