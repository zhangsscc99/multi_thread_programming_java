package com.example.multi_thread_programming_java;

public class MyRun implements Runnable {
    @Override
    public void run() {//t1 //t2执行run方法里的代码

        for (int i = 0; i < 100; i++) {
            //获取到当前线程的对象

            Thread t = Thread.currentThread();
            //System.out.println(t.getName() + "Hello world");
            System.out.println(Thread.currentThread().getName() + "HelloWorld");
        }
    }
}
