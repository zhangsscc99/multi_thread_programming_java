package com.example.test6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MyThreadPrizePool extends Thread{
    ArrayList<Integer> list;
    public MyThreadPrizePool(ArrayList<Integer> list) {
        this.list = list;
    }

    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThreadPrizePool.class) {
                //如果集合数据抽完了 那就结束了
                if (list.size() == 0) {
                    if ("pool1".equals(getName())) {
                        System.out.println("PrizePool1" + list1);
                    } else {
                        System.out.println("PrizePool2" + list2);
                    }
                    break;
                } else {
                    Collections.shuffle(list);//打乱奖池
                    int prize = list.remove(0);
                    //System.out.println(getName() + "produced how much prize" + prize + "big prize");
                    if ("pool1".equals(getName())) {
                        list1.add(prize);
                    } else {
                        list2.add(prize);
                    }

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
