package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int[] [] dot = new int [3] [2];
        for (int i=1; i < 4; i++) {
            System.out.println("Введите координаты точки " + i + " :");
            for (int j=1; j < 3; j++) {
                System.out.print(j == 1 ? "x= " : "y= ");
                dot [i-1] [j-1] = num.nextInt();
            }
        }
        //Просто проверка
        for (int g = 1; g < 4; g++) System.out.println("Координаты точки №" + g + ": x=" + dot[g-1][0] + "; y=" + dot[g-1][1]);
        //Отлавливаю деление на ноль
        try {
            if ((dot[2][0] - dot[0][0]) / (dot[1][0] - dot[0][0]) == (dot[2][1] - dot[0][1]) / (dot[1][1] - dot[0][1])) {
                System.out.println("Точки лежат на одной прямой!");
            } else System.out.println("Точки не лежат на одной прямой!");
        } catch (ArithmeticException e) {
            //Собственно, можно было бы сразу этой формулой, но уже столько всего написал, что решил оставить)
            if ((dot[2][0] * (dot[1][1] - dot[0][1]) - dot[2][1] * (dot[1][0] - dot[0][0])) == (dot[0][0] * dot[1][1] - dot[1][0] * dot[0][1])) {
                System.out.println("Точки лежат на одной прямой!");
            }
            //((x3 * (y2 - y1) - y3 * (x2 - x1)) == (x1 * y2 - x2 * y1))
            else System.out.println("Точки не лежат на одной прямой!");
        }
    }
}
