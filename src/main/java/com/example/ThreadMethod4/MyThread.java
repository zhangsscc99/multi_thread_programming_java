package com.example.ThreadMethod4;

public class MyThread extends Thread{
    @Override
    public  void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + "@" + i);
            Thread.yield();
            //表示出让cpu的执行权 均匀。

        }
    }
}
