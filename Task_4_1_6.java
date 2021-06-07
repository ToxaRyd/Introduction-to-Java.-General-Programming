package com.company;

public class TimeView {
    int sec;

    public int transfer(int h, int m, int s) {
        return (h*60 + m)*60 + s;
    }

    public void change_t(int h, int m, int s) {
        this.sec += transfer(h, m, s);
    }

    public void show_t() {
        int s = this.sec%60;
        int m = this.sec/60;
        int h = m/60;
        m = m%60;
        System.out.println(h + ":" + m + ":" + s);
    }

    public TimeView() {
        this.sec = 0;
    }

    public TimeView(int h, int m, int s) {
        if (h > 24 || m > 60 || s > 60 || h < 0 || m < 0 || s < 0) {
            System.out.println("Неверно заданы значения!");
        } else this.sec = transfer(h, m, s);
    }
}
