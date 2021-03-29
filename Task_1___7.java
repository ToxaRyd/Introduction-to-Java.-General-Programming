package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int m, n;

        System.out.print("Введите значение m: ");
        m = num.nextInt();
        System.out.print("Введите значение n: ");
        n = num.nextInt();

        while (m <= n) {
            System.out.print(m + " : ");

            for (int i = 2; i < m; i++) {
                if (m%i == 0) System.out.print(i + " ");
            }
            System.out.println();
            m++;
        }
    }
}
