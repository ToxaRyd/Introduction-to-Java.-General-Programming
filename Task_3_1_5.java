package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String s = " Hello,  salut,  it's  me,  Your  Duke! ";
        System.out.println(s);
        System.out.println(s.trim().replaceAll("\\s+"," "));
    }
}
