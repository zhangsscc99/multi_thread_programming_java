package com.example.ThreadSafe3;

public class ThreadDemoReentrantLock {
    public static void main(String[] args) {
        //MyThreadReentrantLock mr = new MyThreadReentrantLock();

        MyThreadReentrantLock t1 = new MyThreadReentrantLock();
        MyThreadReentrantLock t2 = new MyThreadReentrantLock();
        MyThreadReentrantLock t3 = new MyThreadReentrantLock();


        t1.setName("window1");
        t2.setName("window2");
        t3.setName("window3");

        t1.start();
        t2.start();
        t3.start();

    }

}
