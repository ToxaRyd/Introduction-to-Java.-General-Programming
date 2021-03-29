package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        double f, e, r = 0;

        System.out.print("Введите число e через зяпятую (0,0): ");
        e = num.nextDouble();

        for (int i=1; i <= 10; i++) {
            f = ((1/Math.pow(2, i)) + (1/Math.pow(3, i)));
            if (Math.abs(f) >= e) {
                r += f;
            }
        }
        System.out.println(r);
    }
}
