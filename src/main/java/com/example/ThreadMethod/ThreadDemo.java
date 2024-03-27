package com.example.ThreadMethod;

import com.example.multi_thread_programming_java.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");
        //设置线程的名字



        t1.start();
        t2.start();
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);

        /*
        1线程执行，线程就会停留
        2时间到了，线程会自动醒来。
         */
    }
}
