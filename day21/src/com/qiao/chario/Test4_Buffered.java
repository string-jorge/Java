package com.qiao.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test4_Buffered {

	/**
	 * 带缓冲区的流中的特殊方法
	 * readLine();
	 * newLine();
	 * 
	 * newLine()与\r\n的区别
	 * newLine()是跨平台的方法
	 * \r\n只支持windows系统
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			//bw.newLine();
			bw.write("\r\n");
		}
		br.close();
		bw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
