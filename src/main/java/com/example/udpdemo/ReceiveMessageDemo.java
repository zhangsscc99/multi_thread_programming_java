package com.example.udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws SocketException {
        //不需要绑定端口发送 但一定要绑定接收的端口。
        //绑定端口接收。
        //接收的端口和发送到的端口要一致。
        //创建datagramsocket对象。
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        try {
            //该方法是阻塞的
            //程序执行到这一步的时候，会在这里死等
            //等发送端发送消息
            System.out.println(11111);
            ds.receive(dp);
            System.out.println(2222);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("receive data" + new String(data, 0, len));
        System.out.println("this data sent from" + address + "this computer's" + port + "(this port)");
//释放资源。
        ds.close();


    }
}
