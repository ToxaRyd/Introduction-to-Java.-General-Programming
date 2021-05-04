package com.company;

class Main
{
    public static void main (String[] args) {
        Student a1 = new Student("Иванов И.И.", 1, new int[] {10,10,9,9,10});
        Student a2 = new Student("Дубанов И.И", 1, new int[] {4,10,8,8,10});
        Student a3 = new Student("Рубанов И.И.",  2, new int[] {1,1,9,9,5});
        Student a4 = new Student("Вавивулин И.И.", 2, new int[] {10,10,9,9,10});
        Student a5 = new Student("Жигулаев И.И.", 3, new int[] {10,10,9,9,10});
        Student a6 = new Student("Жверев И.И.", 3, new int[] {3,4,5,6,10});
        Student a7 = new Student("Зуваев И.И.", 4, new int[] {10,10,9,9,10});
        Student a8 = new Student("Ланин И.И.", 4, new int[] {10,10,9,9,10});
        Student a9 = new Student("Лысый И.И.", 5, new int[] {2,2,2,9,10});
        Student a10 = new Student("Нелысый И.И.", 5, new int[] {10,10,9,9,10});
        Student [] students = new Student[]{a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};

        bestStudents(students);
    }

    public static void bestStudents(Student [] x) {
        for (int i=0; i<x.length; i++) {
            boolean y = true;
            for (int j=0; j<x[i].marks.length; j++) {
                if (x[i].marks[j] != 9 && x[i].marks[j] != 10) y = false;
            }
            if (y == true) {
                System.out.println("Студент: " + x[i].name);
                System.out.println("Номер группы: " + x[i].group_number);
            }
        }
    }
}
