package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int[][] a = new int[8][8];

        // Генерация рандомного списка
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = (int) (Math.random() * 15 - 5);
        }
        // Вывод массива
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        // Нахождение положительных чисел главной диагонали массива
        for (int i = 0; i < a.length; i++) {
            if (a[i][i]>0) System.out.print(a[i][i] + " ");
        }
    }
}
