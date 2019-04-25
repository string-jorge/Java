package com.qiao.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test3_Client {

	/**
	 * �ͻ���������д�ַ���(����¼��),������(���߳�)���ַ�����ת��д��,�ͻ����ٴζ�ȡ�����Ƿ�ת����ַ���
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������Ҫ��ת������:");
			
			Socket socket = new Socket("127.0.0.1", 54321);
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintStream ps = new PrintStream(socket.getOutputStream());
			
			ps.println(sc.nextLine());
			System.out.println(br.readLine());
			
			socket.close();
		}
		
	}

}
