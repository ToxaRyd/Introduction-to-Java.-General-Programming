package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String s = "wor32dwo12rd wor2dwor32word w2ord 2 wo11dwo4rd";
        int c=0;

        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                c++;
            }
        }

        System.out.println(c);
    }
}
