package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int x, y;
        boolean r = false;
        
        System.out.print("x = ");
        x = num.nextInt();
        System.out.print("y = ");
        y = num.nextInt();
        
        if ((0 <= y && y <= 4) && (x >= -2 && x <= 2)) r = true;
        else if ((y >= -3 && y <= 0) && (x >= -4 && x <= 4)) r = true;
        
        System.out.println(r);
    }
}
