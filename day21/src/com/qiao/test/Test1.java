package com.qiao.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Test1 {

	/**
	 * 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
	 * 
	 * 分析:
	 * 		1.创建输入输出流对象
	 * 		2.创建集合对象
	 * 		3.将读到的数据存储在集合中
	 * 		4.倒着遍历集合将数据写到文件上
	 * 		5.关流
	 * 
	 * 注意事项:
	 * 		尽量晚开早关:在哪里开始用在哪里定义,用完就关流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1.创建输入输出流对象
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		
		//2.创建集合对象
		ArrayList<String> list = new ArrayList<>();
		//3.将读到的数据存储在集合中
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		//4.倒着遍历集合将数据写到文件上
		for(int i = list.size() - 1;i >= 0;i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		//5.关流
		bw.close();
	}

}
