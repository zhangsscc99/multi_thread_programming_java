package com.example.ThreadSafe2;

public class MyRunnableSafe implements Runnable{

    int ticket = 0;



    @Override
    public void run() {
        while (true) {

            if (method()) {
                break;
            }


        }

    }

    private synchronized boolean method() {


        if (ticket == 1000) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "is selling" + ticket + "number");
        }
        return false;
    }
}
