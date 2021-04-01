package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a, b=0, c=0, d=0;

        System.out.print("Введите длину массива: ");
        a = num.nextInt();
        int [] n = new int[a];

        for (int i = 0; i < n.length; i++)
        {
            b = (int) (Math.random()*15-5);
            n[i] = b;
        }

        Arrays.sort(n);
        for (int i = 0; i < n.length; i++) System.out.print(n[i] + " ");

        b = 1;
        for (int i = 0; i < (n.length-1); i++) {
            if (n[i] == n[i+1]) {
                b++;
                a = n[i];
            }
            else {
                if (b > c) {
                    c = b;
                    d = a;
                    b = 1;
                }
                else {
                    b = 1;
                    a = n[i];
                }
            }
        }
        if (c == b) {
            if (a > d) System.out.println("Наиболее встречающийся элемент: " + d + "; " + c + " раз");
            else System.out.println("Наиболее встречающийся элемент: " + a + "; " + b + " раз");
        } else System.out.println("Наиболее встречающийся элемент: " + d + "; " + c + " раз");
    }
}
