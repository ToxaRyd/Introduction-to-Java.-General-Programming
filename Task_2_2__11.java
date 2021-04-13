package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[][] a = new int[10][20];
        int b=0;

        // Генерация рандомного списка
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = (int) (Math.random() * 15);
        }
        // Вывод массива
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 5) b++;
                System.out.print(a[i][j] + " ");
            }
            if (b >= 3) {
                System.out.print(" --- В этой строке, #" + (i+1) + ", цифра '5' встречаеться " + b + "-раза!");
            }
            b = 0;
            System.out.println();
        }
    }
}
