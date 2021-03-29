package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a = 0, b = 0;
        String x, y, r = "";

        try {
            System.out.print("Введите первое число: ");
            a = num.nextInt();
            System.out.print("Введите второе число: ");
            b = num.nextInt();
        } catch (Exception e) {
            System.out.println("Нужно вводить числа и только числа!");
        }

        x = String.valueOf(a);
        y = String.valueOf(b);

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    r += x.charAt(i) + " ";
                    break;
                }
            }
        }
        System.out.println("Общие числа: " + r);
    }
}
