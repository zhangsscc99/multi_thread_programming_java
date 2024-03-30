package com.example.ThreadBlocking;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue) {

        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("noodles");
                //put方法的底层已经有锁了
                System.out.println("the cooker put a bowl of noodles");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
