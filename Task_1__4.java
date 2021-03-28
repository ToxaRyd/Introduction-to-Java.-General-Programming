package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a, b, x, y, z;
        boolean r = false;

        System.out.println("Введите значение А:");
        a = num.nextInt();
        System.out.println("Введите значение B:");
        b = num.nextInt();
        System.out.println("Введите значение x:");
        x = num.nextInt();
        System.out.println("Введите значение y:");
        y = num.nextInt();
        System.out.println("Введите значение z:");
        z = num.nextInt();

        if ((a > x) && ((b > y) || (b > z))) r = true;
        if ((a > y) && ((b > x) || (b > z))) r = true;
        if ((a > z) && ((b > y) || (b > x))) r = true;

        if (r) System.out.println("Кирпич проходит через отверстие!");
        else System.out.println("Кирпич не проходит через отверстие!");
    }
}
