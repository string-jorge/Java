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
	 * �ͻ���:
	 * ����Socket���ӷ�����(ָ��ip��ַ,�˿ں�),ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
	 * ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ�����������IO��
	 * ���������Զ�ȡ����������д��������
	 * ����������д�����ݵ�����˵�������
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",12345);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		ps.println("����?");
		System.out.println(br.readLine());
		ps.println("�������");
		System.out.println(br.readLine());
		ps.println("ŶŶ");
		System.out.println(br.readLine());
		
		socket.close();
	}

}
