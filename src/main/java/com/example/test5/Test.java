package com.example.test5;

import com.example.multi_thread_programming_java.MyThread;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //created prize pool
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80);

        //
        MyThreadPrizePool t1 = new MyThreadPrizePool(list);
        MyThreadPrizePool t2 = new MyThreadPrizePool(list);


        t1.setName("pool1");
        t2.setName("pool2");

        t1.start();
        t2.start();

    }
}
