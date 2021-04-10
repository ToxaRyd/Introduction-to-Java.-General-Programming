package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int[][] a = new int[8][8];
        int b, c, d, e;

        System.out.print("Введите номер первого столбца (1-8): ");
        b = num.nextInt() - 1;
        System.out.print("Введите номер второго столбца (1-8): ");
        c = num.nextInt() - 1;
        // Генерация рандомного списка
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = (int) (Math.random() * 15 - 5);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
        // Замена столбцов
        for (int i = 0; i < a.length; i++) {
            d = a[i][b];
            e = a[i][c];
            a[i][b] = e;
            a[i][c] = d;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
