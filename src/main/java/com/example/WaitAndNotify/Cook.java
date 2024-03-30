package com.example.WaitAndNotify;

public class Cook extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("the cooker made a bowl of noodles");
                        Desk.foodFlag = 1;
                        Desk.lock.notifyAll();
                    }
                    //判断有没有食物
                    //如果有 就等待
                    //如果没有 就制作食物
                    //修改桌子上的食物状态
                    //侥幸等待的消费者开吃
                }
            }
            //System.out.println("the cooker made a bowl of noodles");
        }
    }
}
