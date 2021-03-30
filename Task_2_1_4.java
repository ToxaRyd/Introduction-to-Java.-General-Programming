package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int j, b = 0, x, y, z;

        System.out.print("Введите длину массива: ");
        j = num.nextInt();
        int [] n = new int[j];

        for (int i = 0; i < n.length; i++)
        {
            b = (int) (Math.random()*15-5);
            n[i] = b;
        }
        for (int i=0; i < n.length; i++) System.out.print(n[i] + " ");
        x = y = n[0];
        
        for (int i =0; i < n.length; i++) {
            if (n[i] > x) {x = n[i]; j = i;}
            if (n[i] < y) {y = n[i]; b = i;}
        }

        System.out.println("\nЗаменены местами элементы масива: \n максимальный: " + n[j]
                + " индекс - " + j + "\n минимальный: " + n[b] + " индекс - " + b);

        z = n[j];
        n[j] = n[b];
        n[b] = z;

        for (int i=0; i < n.length; i++) System.out.print(n[i] + " ");
    }
}
