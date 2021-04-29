package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String[] s = new String[] {"agga", "alma", "aaaggg", "agggga", "iilii"};
        boolean d=true;

        System.out.println("This program will check if the word is a palindrom.");
        for (int i=0; i<s.length; i++) {
            for (int j=0; j<s[i].length()/2; j++) {
                if (s[i].charAt(j) != s[i].charAt(s[i].length()-j-1)) {
                    d = false;
                    break;
                } else d=true;
            }
            System.out.println((i+1)+" word: " + d);
        }
    }
}
