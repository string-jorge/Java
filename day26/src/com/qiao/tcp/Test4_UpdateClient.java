package com.qiao.tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test4_UpdateClient {

	/**
	 * ��������ϴ��ļ�
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1.��ʾ����Ҫ�ϴ����ļ�·��,��֤·���Ƿ�����Լ��Ƿ����ļ���
		File file = getFile();
		
		//2.�����ļ�����������
		Socket socket = new Socket("127.0.0.1",12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file.getName());
		
		//6.���ܽ��,������ڸ�����ʾ,����ֱ���˳�
		String result = br.readLine();
		if("����".equals(result)) {
			System.out.println("���ϴ����ļ��Ѵ���,�벻Ҫ�ظ��ϴ�!");
			socket.close();
			return;
		}
		
		//7.���������,����FileInputStream��ȡ�ļ�,д��������
		FileInputStream fis = new FileInputStream(file);
		byte[] arr = new byte[8192];
		int len;
		while((len = fis.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		fis.close();
		socket.close();
	}

	private static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ�·��:");
		while(true) {
			String str = sc.nextLine();
			File file = new File(str);
			if(!file.exists()) {
				System.out.println("��������ļ�������,����������:");
			} else if(file.isDirectory()) {
				System.out.println("����������ļ���·��,�������ļ�·��:");
			} else {
				return file;
			}
		}
		
	}

}
