package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int[][] a;
        int n;

        System.out.print("Введите порядок: ");
        n = num.nextInt();
        if (n%2 != 0) {
            System.out.println("Число должно быть четным!");
            System.exit(1);
        }

        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            int x = 1, y = 0;
            for (int j = 0; j < n; j++) {
                if (i%2 == 0) {
                    a[i][j] = x;
                    x++;
                }
                else {
                    a[i][j] = n - y;
                    y++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}