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
        int max = n[0] + n[n.length-1];

        for (int i = 0; i < n.length/2; i++)
            b = n[i] + n[n.length - i - 1];
            if (b > max) max = b;
        System.out.println(max);
    }
}
