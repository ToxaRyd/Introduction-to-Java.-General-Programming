package com.company;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c;
        double result;

        System.out.print("a = ");
        a = num.nextInt();
        System.out.print("b = ");
        b = num.nextInt();
        System.out.print("c = ");
        c = num.nextInt();

        result = ((b + sqrt(pow(b, 2) + 4*a*c))/(2*a))-pow(a, 3)*c + pow(b, -2);
        System.out.println(result);
    }
}
