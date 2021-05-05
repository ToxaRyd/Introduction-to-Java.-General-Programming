package com.company;

import java.util.*;

class Main
{
    public static void main (String[] args) {
        Train a1 = new Train(101, "Istanbul", 9);
        Train a2 = new Train(102, "Munich", 11);
        Train a3 = new Train(103, "Rome", 13);
        Train a4 = new Train(104, "Barcelona", 15);
        Train a5 = new Train(105, "Istanbul", 17);

        Train [] trains = new Train[]{a5, a3, a2, a4, a1};

        Scanner num = new Scanner(System.in);
        System.out.println("Доступные операции: \n 1. Сортировка и вывод списка поездов; \n 2. Вывод инфы по номеру поезда;");
        int v = num.nextInt();

        if (v==1) sortingSequence(trains);
        else if (v==2) infoInquire(trains);
        else {
            System.out.println("Неправильно введен номер операции!");
            System.exit(0);
        }

    }

    public static void sortingSequence(Train [] x) {
        Scanner num = new Scanner(System.in);
        System.out.println("Выберите тип сортировки спискапоездов: \n 1. По номеру поезда; \n 2. По пункту назначения;");
        int d = num.nextInt();

        if (d != 1 && d != 2) {
            System.out.println("Неправильно введен номер сортировки!");
            System.exit(0);
        }

        if (d == 1) {
            Train z;
            for (int j=0; j < x.length; j++) {
                for (int i = 0; i < x.length - 1; i++) {
                    if (x[i].trNumber > x[i + 1].trNumber) {
                        z = x[i];
                        x[i] = x[i + 1];
                        x[i + 1] = z;
                    }
                }
            }
            for (int i=0; i<x.length; i++) {
                System.out.println("Поезд #" + x[i].trNumber);
                System.out.println("Направление: " + x[i].dest);
                System.out.println("Отправление в " + x[i].depar + ":00\n");
            }
        }

        if (d == 2) {
            for (int j=0; j < x.length; j++) {
                Train z;
                for (int i = 0; i < x.length - 1; i++) {
                    if (x[i].dest.length() > x[i + 1].dest.length()) {
                        z = x[i];
                        x[i] = x[i + 1];
                        x[i + 1] = z;
                    }
                }
            }

            for (int j=0; j < x.length; j++) {
                Train z;
                for (int i = j; i < x.length - 1; i++) {
                    if (x[i].depar > x[i + 1].depar && x[i].dest == x[i + 1].dest) {
                        z = x[i];
                        x[i] = x[i + 1];
                        x[i + 1] = z;
                    }
                }
            }

            for (int i=0; i<x.length; i++) {
                System.out.println("Поезд #" + x[i].trNumber);
                System.out.println("Направление: " + x[i].dest);
                System.out.println("Отправление в " + x[i].depar + ":00\n");
            }
        }
    }

    public static void infoInquire(Train [] x) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите номер интересующего вас поезда: ");
        int b = num.nextInt();

        for (int j=0; j < x.length; j++) {
            Train z;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i].depar > x[i + 1].depar) {
                    z = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = z;
                }
            }
        }

        for (int i=0; i<x.length; i++) {
            if (x[i].trNumber == b) {
                System.out.println("Поезд #" + x[i].trNumber);
                System.out.println("Направление: " + x[i].dest);
                System.out.println("Отправление в " + x[i].depar + ":00\n");
            } else {
                System.out.println("Поезда с таким номером не существует!");
                System.exit(0);
            }
        }
    }
}
