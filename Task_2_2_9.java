package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int[][] ar;
        int [] br;
        int a, max=0, ind=0;

        System.out.print("Введите размер матрицы (квадратная): ");
        a = num.nextInt();
        ar  = new int[a][a];
        br = new int[a];

        // Генерация рандомного списка
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) ar[i][j] = (int) (Math.random() * 15);
        }
        // Просто вывод матрицы
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) System.out.print(ar[i][j] + " ");
            System.out.println();
        }
        // Запись сумм столбцов
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                br[j] += ar[i][j];
            }
        }
        // Нахождение максимума
        for (int i = 0; i < br.length; i++) {
            if (br[i] > max) {
                max = br[i];
                ind = i+1;
            }
        }
        System.out.print("Максимальная сумма у " + ind + "-го столбца: " + max);
    }
}
