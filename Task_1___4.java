package com.company;

import java.lang.*;
import java.math.BigInteger;

class Main
{
    public static void main (String[] args)
    {
        BigInteger a = BigInteger.valueOf(1);
        for (int i=1; i <=200; i++) {
            a = a.multiply(BigInteger.valueOf((long) i * i));
            System.out.println(a);
        }
    }
}
