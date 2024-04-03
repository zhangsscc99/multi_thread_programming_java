////package com.example.ThreadPool;
////
////public class CountDownLatch {
////}
//CountDownLatch latch = new CountDownLatch(2);
//// 烹饪食材线程
//        new Thread(() -> {
//        System.out.println("开始烹饪食材");
//        // 模拟烹饪过程
//        try {
//        Thread.sleep(1000); // 模拟烹饪时间
//        } catch (InterruptedException e) {
//        Thread.currentThread().interrupt();
//        }
//        System.out.println("食材准备完成");
//        latch.countDown(); // 减少计数
//        }).start();
//
//// 摆设餐桌线程
//        new Thread(() -> {
//        System.out.println("开始摆设餐桌");
//        // 模拟摆设过程
//        try {
//        Thread.sleep(800); // 模拟摆设时间
//        } catch (InterruptedException e) {
//        Thread.currentThread().interrupt();
//        }
//        System.out.println("餐桌摆设完成");
//        latch.countDown(); // 减少计数
//        }).start();
//// 服务员线程
//        new Thread(() -> {
//        try {
//        System.out.println("服务员正在等待准备工作完成...");
//        latch.await(); // 等待直到计数达到零
//        System.out.println("所有准备工作完成，服务员开始服务");
//        } catch (InterruptedException e) {
//        Thread.currentThread().interrupt();
//        }
//        }).start();
