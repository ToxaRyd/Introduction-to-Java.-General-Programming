package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        int a = 0;

        for (int i=1; i <=100; i++) {
            System.out.println("sqr sum = " + a);
            a += i*i;
        }
    }
}
