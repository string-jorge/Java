package com.qiao.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3_Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(54321);
		System.out.println("服务器启动成功...");
		while(true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());

						String str = br.readLine();
						str = new StringBuffer(str).reverse().toString();
						ps.println(str);
						

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
			
		}
		
	}

}
