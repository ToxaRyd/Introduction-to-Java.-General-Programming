package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String a = "информатика";
        String b = "торт";
        String c = "";

        for (int j=0; j<b.length(); j++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(j)) {
                    c += "" + a.charAt(i);
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
