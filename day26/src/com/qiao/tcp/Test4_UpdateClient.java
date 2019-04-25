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
	 * 向服务器上传文件
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1.提示输入要上传的文件路径,验证路径是否存在以及是否是文件夹
		File file = getFile();
		
		//2.发送文件名到服务器
		Socket socket = new Socket("127.0.0.1",12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file.getName());
		
		//6.接受结果,如果存在给予提示,程序直接退出
		String result = br.readLine();
		if("存在".equals(result)) {
			System.out.println("您上传的文件已存在,请不要重复上传!");
			socket.close();
			return;
		}
		
		//7.如果不存在,定义FileInputStream读取文件,写出到网络
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
		System.out.println("请输入一个文件路径:");
		while(true) {
			String str = sc.nextLine();
			File file = new File(str);
			if(!file.exists()) {
				System.out.println("您输入的文件不存在,请重新输入:");
			} else if(file.isDirectory()) {
				System.out.println("您输入的是文件夹路径,请输入文件路径:");
			} else {
				return file;
			}
		}
		
	}

}
