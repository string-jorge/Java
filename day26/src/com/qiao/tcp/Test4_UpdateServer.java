package com.qiao.tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4_UpdateServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//3.建立多线程服务器
		ServerSocket server = new ServerSocket(12345);
		System.out.println("服务器启动成功...");
		while(true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						//4.读取文件名
						String fileName = br.readLine();
						//5.判断文件是否存在,将结果发回客户端
						File dir = new File("update");
						dir.mkdir();
						File file = new File(dir,fileName);
						if(file.exists()) {
							ps.println("存在");
							socket.close();
							return;
						} else {
							ps.println("不存在");
						}
						//8.定义FileOutputStream,从网络读取数据,存储在本地
						FileOutputStream fos = new FileOutputStream(file);
						byte[] arr = new byte[8192];
						int len;
						while((len = is.read(arr)) != -1) {
							fos.write(arr, 0, len);
						}
						is.close();
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}
