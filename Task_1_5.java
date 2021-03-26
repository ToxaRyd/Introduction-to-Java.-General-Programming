package com.company;
import java.util.Scanner;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Formatter form = new Formatter();
        int n, x;

        System.out.print("sec = ");
        n = num.nextInt();
        x = n/60;
        form.format("%dч %dм %dс", x/60, x%60, n%60);
        System.out.print(form);
    }
}
