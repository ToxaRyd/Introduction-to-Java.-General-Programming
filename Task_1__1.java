package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a, b;

        System.out.print("a = ");
        a = num.nextInt();
        System.out.print("b = ");
        b = num.nextInt();

        if (a+b < 180) {
            System.out.println("Треугольник существует!");
            if ((a == 90) || (b == 90) || (a + b == 90)) {
                System.out.println("Треугольник прямоугольный!");
            }
            else System.out.println("Треугольник не прямоугольный!");
        }
        else System.out.println("Треугольник не существует!");
    }
}
