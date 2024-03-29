

package com.example.ThreadSafe3;

import com.example.multi_thread_programming_java.MyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreadReentrantLock extends Thread {
    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //锁对象这里
            //同步代码块 轮流执行。
            //MyThread.class
            //字节码文件对象是锁唯一的。可以当作锁。
            //synchronized (MyThread.class) {
            lock.lock();
            try {
                if (ticket == 1000) {
                    break;

                } else {
    //                try {
                    Thread.sleep(10);
    //                } catch (InterruptedException e) {
    //                    e.printStackTrace();
    //                }
                    ticket++;
                    System.out.println(getName() + "is selling" + ticket);
                    //lock.unlock();

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}


