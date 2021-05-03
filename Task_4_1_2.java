package com.company;

public class Test2 {
    private int a1;
    private int b1;

    public int getA1() {
        return this.a1;
    }

    public int getB1() {
        return this.b1;
    }

    public void setA1(int a) {
        this.a1 = a;
    }

    public void setB1(int b) {
        this.b1 = b;
    }

    public Test2() {
        a1 = 0;
        b1 = 0;
    }

    public Test2(int a, int b) {
        a1 = a;
        b1 = b;
    }
}
