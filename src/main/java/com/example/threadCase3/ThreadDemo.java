package com.example.threadCase3;

import com.example.multi_thread_programming_java.MyRun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@SpringBootApplication
public class ThreadDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);

        t1.start();

        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);

        //给线程设置名字
        //需要知道哪个线程执行的操作
        //管理多线程运行的结果 5050

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
