
package com.company;

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        String s = " aaazazazaaazazazaaazzazaaa ";
        int c=0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a') {
                c++;
            }
        }
        System.out.println("Буква 'а' встречаеться " + c + " раз");
    }
}