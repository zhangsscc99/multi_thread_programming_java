package com.example.multi_thread_programming_java;

public class MyRun extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread t1 = Thread.currentThread();
            System.out.println("Hello world");
        }
    }
}
