package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String s = " Hello,  salut,   it's  me,    Your  Duke! ";
        int c=0, e=0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            } else {
                if (c > e) {
                    e = c;
                }
                c = 0;
            }
        }
        System.out.println("Наибольшее количество пробелов в строке: " + e);
    }
}
