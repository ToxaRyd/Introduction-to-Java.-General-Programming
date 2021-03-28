package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a, b, h;

        System.out.print("Введите начало отрезка a: ");
        a = num.nextInt();
        System.out.print("Введите конец отрезка b: ");
        b = num.nextInt();
        System.out.print("Введите шаг h: ");
        h = num.nextInt();

        System.out.println("|  x  |  y  |");

        for (int i=a; i < b; i += h) {
            if (i > 2) {
                System.out.println("|  " + i + "  |  " + i + "  |");
            }
            else {
                System.out.println("|  " + i + "  |  " + (-i) + "  |");
            }
        }
    }
}
