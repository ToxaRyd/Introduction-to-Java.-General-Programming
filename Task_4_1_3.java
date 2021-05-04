package com.company;

public class Student {
    String name;
    int group_number;
    int [] marks = new int[5];

    public Student (String a, int b, int [] c) {
        this.name = a;
        this.group_number = b;
        this.marks = c;
    }

    public Student () {
        this.name = "Студент";
        this.group_number = 0;
        for (int i=0; i<marks.length; i++) this.marks[i] = 1;
    }
}
