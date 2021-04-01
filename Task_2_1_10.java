package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a, b=0;

        System.out.print("Введите длину массива: ");
        a = num.nextInt();
        int [] n = new int[a];

        for (int i = 0; i < n.length; i++) {
            b = (int) (Math.random()*15-5);
            n[i] = b;
        }

        for (int i = 0; i < n.length; i++) System.out.print(n[i] + " ");
        System.out.println();

        b = 0;
        for (int i=1; i < n.length; i+=2) n[i] = 0;

        for (int i = 0; i < n.length; i++) System.out.print(n[i] + " ");
    }
}
