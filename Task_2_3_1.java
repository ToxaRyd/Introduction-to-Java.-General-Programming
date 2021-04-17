package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int [] a = new int[] {1, 2, 3, 7, 8, 9};
        int [] b = new int[] {4, 5, 6};


        System.out.print("Ввести число k: ");
        int k = num.nextInt()-1;

        // Объединение :D
        int c, d, e;
        c = b[0];
        d = b[1];
        e = b[2];
        b = new int[9];

        for (int i=0; i < b.length; i++) {
            if (i <= k) {
                b[i] = a[i];
            } else {
                b[i] = c;
                b[i+1] = d;
                b[i+2] = e;
                for (int j=i+3; j < b.length; j++) {
                    b[j] = a[j-3];
                }
                break;
            }
        }
        // Вывод массива
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
