package com.example.WaitAndNotify;

public class Desk {
    //int可以控制很多条线程轮流执行。
    //第四条线程。
    public static int foodFlag = 1;

    public static int count = 10;

    public static Object lock = new Object();


}
