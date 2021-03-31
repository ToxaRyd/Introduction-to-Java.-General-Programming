package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int j, b;

        System.out.print("Введите длину массива: ");
        j = num.nextInt();
        int [] n = new int[j];

        for (int i = 0; i < n.length; i++)
        {
            b = (int) (Math.random()*15-5);
            n[i] = b;
        }

        for (int i=0; i < n.length; i++) {
            if (n[i] > i) System.out.println(n[i]);
        }
    }
}
