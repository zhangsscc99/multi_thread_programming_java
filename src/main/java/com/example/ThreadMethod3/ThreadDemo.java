package com.example.ThreadMethod3;

import com.example.multi_thread_programming_java.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("godness");
        t2.setName("spare wheel");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }

}
