package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int j, b, x=0, y=0, z=0;

        System.out.print("Введите длину массива: ");
        j = num.nextInt();
        int [] n = new int[j];

        for (int i = 0; i < n.length; i++)
        {
            b = (int) (Math.random()*15-5);
            n[i] = b;
            if (b > 0) x++;
            else if (b < 0) y++;
            else z++;
        }

        System.out.println("Число положительных чисел: " + x);
        System.out.println("Число отрицательных чисел: " + y);
        System.out.println("Число нулевых чисел: " + z);
    }
}
