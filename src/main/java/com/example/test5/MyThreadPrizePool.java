package com.example.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThreadPrizePool extends Thread{
    ArrayList<Integer> list;
    public MyThreadPrizePool(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThreadPrizePool.class) {
                //如果集合数据抽完了 那就结束了
                if (list.size() == 0) {
                    break;
                } else {
                    Collections.shuffle(list);//打乱奖池
                    int prize = list.remove(0);
                    System.out.println(getName() + "produced how much prize" + prize + "big prize");
                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
