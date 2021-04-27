package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String [] a = new String[] {"camelCase", "camelCase", "camelCase", "camelCase", "camelCase"};

        for (int i=0; i < a.length; i++) {
            String r = "";
            for (int j=0; j < a[i].length(); j++) {
                char c = a[i].charAt(j);
                if (Character.isUpperCase(c)) {
                    r += '_';
                    r = r + Character.toLowerCase(c);
                } else r += c;
            }
            a[i] = r;
        }

        for (int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
