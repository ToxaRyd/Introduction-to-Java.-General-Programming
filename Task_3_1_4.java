package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String s = "wo2536246246r32dwo12rd wor2dwor32word w2ord 2 wo11dwo4rd";
        int c=0;

        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                for (int j=i+1; j<s.length(); j++) {
                    if (!Character.isDigit(s.charAt(j))) {
                        c++;
                        i = j;
                        break;
                    }
                }
            }
        }

        System.out.println(c);
    }
}
