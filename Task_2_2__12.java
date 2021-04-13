package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[][] a = new int[10][20];
        int b=0, c=0, d=0, e=0;

        // Генерация рандомного списка
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = (int) (Math.random() * 15);
        }
        // Сортировка
        for (int i = 0; i < a.length; i++) {
            while (b < a[i].length)  {
                for (int j = b; j < a[i].length; j++){
                    if (a[i][j] >= c) {
                        c = a[i][j];
                        d = j;
                    }
                }
                e = a[i][b];
                a[i][b] = c;
                a[i][d] = e;
                b++;
                c = 0;
            }
            b = 0;
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
