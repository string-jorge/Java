package com.qiao.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {

	/**
	 * @param args
	 * ��֪һ����
	 * (1)дһ��Properties��ʽ�������ļ�,���������������
	 * (2)дһ������,��ȡ���Properties�����ļ�,�������������Ʋ����������,�÷���ķ�ʽ����run����
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.properties"));
		Class clazz = Class.forName(br.readLine());
		DemoClass dc = (DemoClass) clazz.newInstance();
		dc.run();
	}

}
