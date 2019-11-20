package com.guc.pattern.net;

import javax.swing.*;
import java.io.*;
import java.net.Socket;

/**
 * @Author guc
 * @Date 2019/11/20 16:11
 * @Description TODO
 */
public class SocketClient {
    private static final String IP= "192.168.20.158";
    private static final int PORT= 8088;
    public static void main(String[] args) {
        System.out.println("连接到主机：" + IP + "：" + PORT);
        try {
            Socket client = new Socket(IP,PORT);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应： " + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
