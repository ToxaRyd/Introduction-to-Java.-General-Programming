
package com.company;

import java.lang.*;
import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Введите строку: ");
        StringBuilder s = new StringBuilder(a.nextLine());

        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) s.deleteCharAt(j);
            }
        }
        System.out.println(s.toString());
    }
}