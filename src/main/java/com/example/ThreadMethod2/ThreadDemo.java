package com.example.ThreadMethod2;

public class ThreadDemo {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "plane");
        Thread t2 = new Thread(mr, "tank");



        //设置线程的名字

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();


        /*
        1线程执行，线程就会停留
        2时间到了，线程会自动醒来。
         */
    }
}
