package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int[][] a = new int[4][4];
        int k, p;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = (int) (Math.random() * 15 - 5);
        }
        System.out.println("Размер матрицы 4х4!");
        System.out.print("Введите номер строки: ");
        k = num.nextInt();
        System.out.print("Введите номер столбца: ");
        p = num.nextInt();

        try {
            System.out.println(a[k-1][p-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введенные значения вне размера матрицы!");
        }
    }
}
