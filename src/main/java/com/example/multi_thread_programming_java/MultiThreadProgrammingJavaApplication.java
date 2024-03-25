package com.example.multi_thread_programming_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiThreadProgrammingJavaApplication {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();


        t1.setName("线程1");
        t2.setName("线程2");


        t1.start();
        t2.start();



        //SpringApplication.run(MultiThreadProgrammingJavaApplication.class, args);
    }

}
