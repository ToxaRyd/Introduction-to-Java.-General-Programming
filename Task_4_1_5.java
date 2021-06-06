package com.company;

public class Counter {
    int c;

    public void increase() {
        if (this.c == 10) {
            System.out.println("Maximum is already reached!");
        } else {
            this.c += 1;
            System.out.println("Increased! Current number: " + this.c);
        }
    }

    public void decrease() {
        if (this.c == 0) {
            System.out.println("Minimum is already reached!");
        } else {
            this.c -= 1;
            System.out.println("Decreased! Current number: " + this.c);
        }
    }

    public void show() {
        System.out.println("Current number: " + this.c);
    }

    public Counter(int c) {
        if (c < 0 || c > 10) {
            System.out.println("Error: number should be in range of 0...10!");
            System.exit(0);
        } else {
            this.c = c;
        }
    }

    public Counter() {
        this.c = 0;
    }
}
