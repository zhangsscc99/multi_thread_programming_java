package com.example.ThreadMethod5;

import com.example.ThreadMethod4.MyThread;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread t= new MyThread();
        t.setName("potato");
        t.start();

        //t.join();

        //插入线程就可以实现先后顺序

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread" + i);

        }
    }
}
