package com.example.WaitAndNotify;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //先判断桌子上是否有面条 如果有就开吃 没有就等待。
                    //都吃了就唤醒厨师继续做。
                    //吃的总数-1
                    //修改桌子状态

                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait();//当前线程和锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }






                    } else {
                        Desk.count--;
                        System.out.println("eating noodles, can eat more" + Desk.count + "bowl");
                        Desk.lock.notifyAll();//唤醒这把锁绑定的所有线程

                        Desk.foodFlag = 0;


                    }
                }

            }
        }
    }
}
