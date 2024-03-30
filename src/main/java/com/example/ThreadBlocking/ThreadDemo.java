package com.example.ThreadBlocking;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        //阻塞队列 完成生产者消费者（等待唤醒机制）的代码
        //生产者消费者必须使用同一个阻塞队列。
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        c.start();
        f.start();

    }
}
