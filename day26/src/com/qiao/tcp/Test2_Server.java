package com.qiao.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2_Server {

	/**
	 * @param args
	 * �����:
	 * ����ServerSocket(��Ҫָ���˿ں�)
	 * ����ServerSocket��accept()
	 * ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
	 * ���������Զ�ȡ�ͻ��������д��������
	 * ���������д�����ݵ��ͻ��˵�������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo();
		//���߳�
		ServerSocket server = new ServerSocket(12345);
		while(true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new  BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						System.out.println(br.readLine());
						ps.println("��ӭ������!");
						System.out.println(br.readLine());
						ps.println("����");
						System.out.println(br.readLine());
						ps.println("...");
						
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
			
		}
		
	}
	//���߳�
	private static void demo() throws IOException {
		ServerSocket server = new ServerSocket(12345);
		Socket socket = server.accept();
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		System.out.println(br.readLine());
		ps.println("��ӭ������!");
		System.out.println(br.readLine());
		ps.println("����");
		System.out.println(br.readLine());
		ps.println("...");
		
		socket.close();
	}

}
