
package com.company;

import java.lang.*;
import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Введите слова: ");
        StringBuilder s = new StringBuilder(a.nextLine());
        s.append(" ");
        String st = "";
        String thebiggest = "";

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != ' ') {
                st += "" + s.charAt(i);
            } else {
                if (st.length() > thebiggest.length() ) {
                    thebiggest = st;
                }
                st = "";
            }
        }
        System.out.println(thebiggest);
    }
}
