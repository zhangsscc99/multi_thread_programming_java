package com.example.ThreadSafe2;

public class ThreadDemoSafeThread {
    public static void main(String[] args) {
        MyRunnableSafe mr = new MyRunnableSafe();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("window1");
        t2.setName("window2");
        t3.setName("window3");

        t1.start();
        t2.start();
        t3.start();

    }

}
