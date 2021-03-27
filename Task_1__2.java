package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("a = ");
        a = num.nextInt();
        System.out.print("b = ");
        b = num.nextInt();
        System.out.print("c = ");
        c = num.nextInt();
        System.out.print("d = ");
        d = num.nextInt();

        a = (a > b ? a : b);
        b = (c > d ? c : d);

        System.out.println(a > b ? a : b);
    }
}
