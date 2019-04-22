package com.qiao.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Test2 {

	/**
	 * ��ȡ�ı���ÿһ���ַ����ֵĴ���,�����д��times.txt��
	 * 
	 * ����:
	 * 1.���������������������
	 * 2.����TreeMap˫�м��϶���
	 * 3.���������ַ��洢��˫�м�����,�洢��ʱ��Ҫ���ж�,��������������,�ͽ�����1�洢,������������,�ͽ��Ľ���ֵ��һ�洢
	 * 4.�ر�������
	 * 5.�������������
	 * 6.�������Ͻ������е�����д��times.txt��
	 * 7.�ر������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1.������������ַ�����������
		BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
		//2.����TreeSet˫�м��϶���
		TreeMap<Character, Integer> tm = new TreeMap<>();
		//3.���������ַ��洢��˫�м�����,�洢��ʱ��Ҫ���ж�,��������������,�ͽ�����1�洢,������������,�ͽ��Ľ���ֵ��һ�洢
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
		//4.�ر�������
		br.close();
		//5.�������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		//6.�������Ͻ������е�����д��times.txt��
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
			default : bw.write(key + " = " + tm.get(key));			//д������ֵ
				break;
			}
			bw.newLine();
		}
		//7.�ر������
		bw.close();
	}

}
