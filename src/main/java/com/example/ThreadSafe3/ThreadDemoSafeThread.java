package com.example.ThreadSafe3;

public class ThreadDemoSafeThread {
    public static void main(String[] args) {
        //MyThreadReentrantLock mr = new MyThreadReentrantLock();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        t1.setName("window1");
        t2.setName("window2");
        t3.setName("window3");

        t1.start();
        t2.start();
        t3.start();

    }

}
