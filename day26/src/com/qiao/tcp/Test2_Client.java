package com.qiao.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test2_Client {

	/**
	 * @param args
	 * 客户端:
	 * 创建Socket连接服务器(指定ip地址,端口号),通过ip地址找对应的服务器
	 * 调用Socket的getInputStream()和getOutputStream()方法获取和服务器相连的IO流
	 * 输入流可以读取服务端输出流写出的数据
	 * 输入流可以写出数据到服务端的输入流
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",12345);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		ps.println("在吗?");
		System.out.println(br.readLine());
		ps.println("你干嘛呢");
		System.out.println(br.readLine());
		ps.println("哦哦");
		System.out.println(br.readLine());
		
		socket.close();
	}

}
