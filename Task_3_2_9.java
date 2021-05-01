
package com.company;

import java.lang.*;
import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Введите строку: ");
        StringBuilder s = new StringBuilder(a.nextLine());
        int up=0, down=0;

        for (int i=0; i<s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                up++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                down++;
            }
        }
        System.out.println("Строчных: " + up + "; Прописных: " + down);
    }
}
