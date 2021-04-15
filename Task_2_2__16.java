package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int c=1, r=0, cr, cc;

        System.out.println("Ввести размерность матрицы: ");
        int n = num.nextInt();
        int co = n/2;

        int[][] a = new int[n][n];

        // Генерация магической матрицы
        while (c <= n * n) {
            a[r][co] = c;
            c++;
            cr = r;
            cc = co;
            r -= 1;
            co += 1;
            if (r == -1) {
                r = n - 1;
            }
            if (co == n) {
                co = 0;
            }
            if (a[r][co] != 0) {
                r = cr + 1;
                co = cc;
                if (r == -1) {
                    r = n - 1;
                }
            }
        }
        // Вывод массива
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
