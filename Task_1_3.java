package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y;
        double result;

        System.out.print("x = ");
        x = num.nextInt();
        System.out.print("y = ");
        y = num.nextInt();

        result = ((Math.sin(Math.toDegrees(x))+Math.cos(Math.toDegrees(y)))/(Math.cos(Math.toDegrees(x))-Math.sin(Math.toDegrees(y))))*Math.tan(Math.toDegrees(x*y));
        System.out.println(result);
    }
}
