package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int [] a = new int[] {0, 9, 8, 7, 5, 4, 3, 2, 1};
        int x, c=0;

        //Сортировка
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    x = a[i];
                    a[i] = a[j];
                    a[j]= x;
                    c++;
                }
            }
        }
        // Вывод массива
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("Количество перестановок: " + c);
    }
}
