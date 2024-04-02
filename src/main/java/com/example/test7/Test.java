package com.example.test7;

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
        MyThreadPrizePool t3 = new MyThreadPrizePool(list);
        MyThreadPrizePool t4 = new MyThreadPrizePool(list);
        MyThreadPrizePool t5 = new MyThreadPrizePool(list);



        t1.setName("pool1");
        t2.setName("pool2");
        t3.setName("pool3");
        t4.setName("pool4");
        t5.setName("pool5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
