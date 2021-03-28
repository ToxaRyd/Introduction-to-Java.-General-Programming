package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        float x, r = 0;

        System.out.print("Введите значение x: ");
        x = num.nextInt();

        if (x <= 3) r = x*x - 3*x + 9;
        else if (x > 3) r = 1/(x*x*x + 6);

        System.out.println("F(x) = " + r);
    }
}
