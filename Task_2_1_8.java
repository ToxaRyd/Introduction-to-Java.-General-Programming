package com.company;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        int j, b=0, y=0;

        System.out.print("Введите длину массива: ");
        j = num.nextInt();
        int [] n = new int[j];

        for (int i = 0; i < n.length; i++)
        {
            b = (int) (Math.random()*15-5);
            n[i] = b;
        }
        for (int i = 0; i < n.length; i++) System.out.print(n[i] + " ");
        //Переиспользуем переменные
        b = n[0];
        j = 1;
        //Находим наименьший элемент и его количество в массиве
        for (int i = 0; i < n.length; i++) {
            if (n[i] < b) {
                b = n[i];
                j = 1;
            }
            else if (n[i] == b) j++;
        }
        System.out.println("\nНаименьший элемент массива: " + b + "; в количестве: " + j);
        //Формируем новый
        int[] x = new int[n.length - j];

        for (int i = 0; i < x.length; i++) {
            if (n[y] > b) x[i] = n[y];
            y++;
        }

        for (int i = 0; i < x.length; i++) System.out.print(x[i] + " ");
    }
}
