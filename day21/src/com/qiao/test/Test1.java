package com.qiao.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Test1 {

	/**
	 * ��һ���ı��ĵ��ϵ��ı���ת,��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
	 * 
	 * ����:
	 * 		1.�����������������
	 * 		2.�������϶���
	 * 		3.�����������ݴ洢�ڼ�����
	 * 		4.���ű������Ͻ�����д���ļ���
	 * 		5.����
	 * 
	 * ע������:
	 * 		���������:�����￪ʼ�������ﶨ��,����͹���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1.�����������������
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		
		//2.�������϶���
		ArrayList<String> list = new ArrayList<>();
		//3.�����������ݴ洢�ڼ�����
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		//4.���ű������Ͻ�����д���ļ���
		for(int i = list.size() - 1;i >= 0;i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		//5.����
		bw.close();
	}

}
