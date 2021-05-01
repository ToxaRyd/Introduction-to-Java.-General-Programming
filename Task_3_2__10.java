
package com.company;

import java.lang.*;
import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Введите строку: ");
        StringBuilder s = new StringBuilder(a.nextLine());
        int c=0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') c++;
        }
        System.out.println("Количество предложений: " + c);
    }
}
