package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s;
        char[] c;

        System.out.print("Введите последовательность символов: ");
        s = scanner.nextLine();
        c = s.toCharArray();

        for (int i=0; i < s.length(); i++) {

            System.out.println(i + " --- " + System.identityHashCode(c[i]));
        }
    }
}
