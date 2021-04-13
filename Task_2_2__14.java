package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[][] a = new int[10][10];

        // Генерация
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                a[i][j] = 1;
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
