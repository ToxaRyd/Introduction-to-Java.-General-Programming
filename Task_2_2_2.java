package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[][] a = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) a[i][j] = (int) (Math.random() * 15 - 5);
        }
        int j = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i][j]);
            j++;
        }
    }
}
