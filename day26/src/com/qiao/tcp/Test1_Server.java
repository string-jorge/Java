package com.qiao.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {

	/**
	 * @param args
	 * 服务端:
	 * 创建ServerSocket(需要指定端口号)
	 * 调用ServerSocket的accept()
	 * 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	 * 输入流可以读取客户端输出流写出的数据
	 * 输出流可以写出数据到客户端的输入流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		os.write("百度一下你就知道了".getBytes());
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);
		System.out.println(new String(arr,0,len));
		
		socket.close();
	}

}
