package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int j, b=0;

        System.out.print("Введите длину массива: ");
        j = num.nextInt();
        int [] n = new int[j];

        for (int i = 0; i < n.length; i++)
        {
            b = (int) (Math.random()*15-5);
            n[i] = b;
        }
        b = 0;
        for (int i=2; i < n.length; i++) {
            for (j=2; j <= i/2; j++) {
                if (i%j == 0) break;
            }
            b += n[i];
        }
        System.out.println("Сумма чисел: " + b);
    }
}
