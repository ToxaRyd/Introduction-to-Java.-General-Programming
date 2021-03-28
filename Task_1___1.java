package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int x, r = 0;

        System.out.print("Введите значение x: ");
        x = num.nextInt();

        if (x < 0) {
            System.out.println("Х не может быть меньше нуля!");
            System.exit(0);
        }

        for (int i =1; i <= x; i++) {
            r += i;
        }
        System.out.println("Overall sum = " + r);
    }
}
