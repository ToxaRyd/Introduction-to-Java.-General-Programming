package com.company;

public class Test1 {
    public int a1;
    public int b1;

    public void show() {
        System.out.println("a= " + a1 + "; b= " + b1 + ";");
    }

    public void edit(int a, int b) {
        a1 = a;
        b1 = b;
        System.out.println("Данные были изменены!");
    }

    public void sum() {
        System.out.println("a + b =  " + (a1 + b1) + ";");
    }

    public void max() {
        if (a1>b1) System.out.println("a больше!");
        else System.out.println("b больше!");
    }

    public Test1 () {}

    public Test1 (int a, int b) {
        a1 = a;
        b1 = b;
    }

}
