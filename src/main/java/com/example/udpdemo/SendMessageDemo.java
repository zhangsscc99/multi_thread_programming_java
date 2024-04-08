package com.example.udpdemo;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws SocketException {
        //绑定端口。空参数 可用的端口里随机一个使用。
        //有参数 指定端口号
        //创建datagramsocket对象
        //快递公司
        DatagramSocket ds = new DatagramSocket();
        String str = "you amazing";
        byte[] bytes = str.getBytes();

        InetAddress address = null;
        try {
            address = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        int port = 10086;

        //打包数据
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        try {
            ds.send(dp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ds.close();

    }
}
