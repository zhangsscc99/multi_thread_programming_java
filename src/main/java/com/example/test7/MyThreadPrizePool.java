package com.example.test7;

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
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyThreadPrizePool.class) {
                //如果集合数据抽完了 那就结束了
                if (list.size() == 0) {
                    System.out.println(getName() + boxList);
                    break;
                } else {
                    Collections.shuffle(list);//打乱奖池
                    int prize = list.remove(0);
                    //System.out.println(getName() + "produced how much prize" + prize + "big prize");
                    boxList.add(prize);

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
