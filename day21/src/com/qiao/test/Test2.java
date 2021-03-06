package com.qiao.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Test2 {

	/**
	 * 获取文本上每一个字符出现的次数,将结果写在times.txt上
	 * 
	 * 分析:
	 * 1.创建带缓冲的输入流对象
	 * 2.创建TreeMap双列集合对象
	 * 3.将读到的字符存储在双列集合中,存储的时候要做判断,如果不包含这个键,就将键和1存储,如果包含这个键,就将改建和值加一存储
	 * 4.关闭输入流
	 * 5.创建输出流对象
	 * 6.遍历集合将集合中的内容写到times.txt中
	 * 7.关闭输出流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1.创建带缓冲的字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
		//2.创建TreeSet双列集合对象
		TreeMap<Character, Integer> tm = new TreeMap<>();
		//3.将读到的字符存储在双列集合中,存储的时候要做判断,如果不包含这个键,就将键和1存储,如果包含这个键,就将改建和值加一存储
		int ch;
		while((ch = br.read()) != -1) {
			char c = (char)ch;
			/*if(!tm.containsKey(c)) {
				tm.put(c, 1);
			} else {
				tm.put(c, tm.get(c) + 1);
			}*/
			tm.put(c, !tm.containsKey(c) ? 1 : tm.get(c) + 1);
		}
		//4.关闭输入流
		br.close();
		//5.创建输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		//6.遍历集合将集合中的内容写到times.txt中
		for(Character key : tm.keySet()) {
			switch (key) {
			case '\t':
				bw.write("\\t" + " = " + tm.get(key));
				break;
			case '\r':
				bw.write("\\r" + " = " + tm.get(key));
				break;
			case '\n':
				bw.write("\\n" + " = " + tm.get(key));
				break;
			default : bw.write(key + " = " + tm.get(key));			//写出键和值
				break;
			}
			bw.newLine();
		}
		//7.关闭输出流
		bw.close();
	}

}
