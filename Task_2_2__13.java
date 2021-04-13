package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[][] a = new int[10][20];
        int b=0, c=0, d=0, e=0, f=0, g=0;

        // Генерация рандомного списка
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = (int) (Math.random() * 15);
        }
        // Сортировка
        while (b != (a[0].length)) {
            while (f < a.length) {
                for (int i = f; i < a.length; i++) {
                    if (c < a[i][b]) {
                        c = a[i][b];
                        d = i;
                    }
                }
                g = a[f][b];
                a[f][b] = c;
                a[d][b] = g;
                f++;
                c = 0;
            }
            b++;
            f = 0;
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
