package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[][] a = new int[10][20];
        int b=0;

        // Генерация рандомного списка
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 15 - 5);
                if (a[i][j] > b) b = a[i][j];
            }
        }
        System.out.println("Самый большой элемент матрицы: " + b);
        // Замена нечетных чисел самым большим элементом
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]%2 != 0) a[i][j] = b;
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
