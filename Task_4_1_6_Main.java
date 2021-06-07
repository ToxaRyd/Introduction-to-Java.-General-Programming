package com.company;


class Main
{
    public static void main (String[] args) {
        TimeView a = new TimeView(23, 59, 59);
        a.show_t();
        a.change_t(-10, -20, -30);
        a.show_t();
    }
}