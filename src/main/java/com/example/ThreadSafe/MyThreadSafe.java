

package com.example.ThreadSafe;

public class MyThreadSafe extends Thread{
    static int ticket = 0;

    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //锁对象这里
            //同步代码块 轮流执行。
            //MyThread.class
            //字节码文件对象是锁唯一的。可以当作锁。
            synchronized (obj) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "is selling" + ticket);
                } else {
                    break;
                }
            }
        }
    }
}
