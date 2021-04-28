package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String s = " aaazzzaaazzzaaazzzaaa ";
        String d = "";

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a') {
                d += "" + s.charAt(i) + "" + 'b';
            } else d += "" + s.charAt(i);
        }
        System.out.println(d);
    }
}
