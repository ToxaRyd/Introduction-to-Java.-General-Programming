package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        double[][] a;
        double b;
        int n, x=0;

        System.out.print("Введите порядок: ");
        n = num.nextInt();

        a = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b = Math.sin((i*i-j*j)/n);
                if (b>0) x++;
                a[i][j] = b;
            }
        }
        System.out.println("количество положительных эелементов: " + x);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
