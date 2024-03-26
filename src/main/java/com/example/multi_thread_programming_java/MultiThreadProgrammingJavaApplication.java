package com.example.multi_thread_programming_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiThreadProgrammingJavaApplication {


    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //给线程设置名字
        //需要知道哪个线程执行的操作
        t1.setName("thread1");
        t2.setName("thread2");


        t1.start();
        t2.start();

        //多线程第二种启动方式
        //自己定义一个类实现runnable接口
        //重写里面的run方法。
        //创建自己的类的对象。
        //创建一个thread类的对象，并开启线程。



//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//
//        t1.setName("线程1");
//        t2.setName("线程2");
//
//
//        t1.start();
//        t2.start();



        //SpringApplication.run(MultiThreadProgrammingJavaApplication.class, args);
    }

}
