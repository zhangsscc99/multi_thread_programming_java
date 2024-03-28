package com.example.ThreadSafe;

import com.example.multi_thread_programming_java.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("window1");
        t2.setName("window2");
        t3.setName("window3");

        t1.start();
        t2.start();
        t3.start();

    }
}
