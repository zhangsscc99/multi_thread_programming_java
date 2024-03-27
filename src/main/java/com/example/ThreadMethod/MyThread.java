package com.example.multi_thread_programming_java;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }
    //可以用alt insert选择constructor


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "Helloworld");
            //线程是交替的

        }
    }
}
