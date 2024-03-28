package com.example.ThreadSafe;

public class MyThread extends Thread{
    int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (ticket < 100) {
                ticket++;
                System.out.println(getName() + "is selling" + ticket);
            } else {
                break;
            }
        }
    }
}
