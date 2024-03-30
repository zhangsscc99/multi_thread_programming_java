package com.example.WaitAndNotify;

public class ThreadDemo {

    public static void main(String[] args) {
        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("cooker");
        f.setName("foodie");

        c.start();
        f.start();
    }
}
