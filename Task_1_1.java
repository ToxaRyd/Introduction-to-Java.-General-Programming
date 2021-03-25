package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float a, b, c, z;
        System.out.print("a = ");
        a = num.nextFloat();
        System.out.print("b = ");
        b = num.nextFloat();
        System.out.print("c = ");
        c = num.nextFloat();
        z = ((a - 3)*b/2) + c;
        System.out.println("The result is: " + z);
    }
}
