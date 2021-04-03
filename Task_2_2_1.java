package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[][] a = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) a[i][j] = (int) (Math.random() * 15 - 5);
        }
        for (int i = 1; i < 4; i+=2) {
            if(a[i][0] > a[i][3]) {
                for (int j=0; j < 4; j++) System.out.println(a[i][j]);
            }
            else System.out.println("Столбец "+i+" не соответствует условиям!");
        }
    }
}
