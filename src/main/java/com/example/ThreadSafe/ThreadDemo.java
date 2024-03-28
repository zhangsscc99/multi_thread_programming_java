package com.example.ThreadSafe;

import com.example.multi_thread_programming_java.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThreadSafe t1 = new MyThreadSafe();
        MyThreadSafe t2 = new MyThreadSafe();
        MyThreadSafe t3 = new MyThreadSafe();

        t1.setName("window1");
        t2.setName("window2");
        t3.setName("window3");

        t1.start();
        t2.start();
        t3.start();

    }
}
