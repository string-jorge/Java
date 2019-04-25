package com.qiao.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test1_Client {

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
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);
		System.out.println(new String(arr,0,len));
		
		os.write("你在干嘛?".getBytes());
		
		socket.close();
	}

}
