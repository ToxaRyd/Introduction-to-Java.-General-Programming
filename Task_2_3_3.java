package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int [] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x;

        //Сортировка
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    x = a[i];
                    a[i] = a[j];
                    a[j]= x;
                }
            }
        }
        // Вывод массива
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
