package com.example.ThreadBlocking;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends  Thread{
    ArrayBlockingQueue<String> queue;
    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //锁的嵌套会死锁。
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
