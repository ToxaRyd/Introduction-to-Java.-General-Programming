package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float n;

        System.out.print("num = ");
        n = num.nextFloat();

        String s = new StringBuilder(String.valueOf(n)).reverse().toString();

        System.out.println(s);
    }
}
