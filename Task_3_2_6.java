
package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String s = "abcdef";
        String d = "";

        for (int i=0; i<s.length(); i++) {
            d += "" + s.charAt(i) + s.charAt(i);
        }
        System.out.println(d);
    }
}