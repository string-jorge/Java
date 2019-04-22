package com.qiao.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Test10_Properties {

	/**
	 * @param args
	 * Properties��Hashtable������
	 * Properties���ʾ��һ���־õ����Լ�
	 * Properties���Ա��������л�����м���
	 * �����б��е�ÿһ���������Ӧֵ����һ���ַ���
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//demo1();
		//demo2();
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));			//��;���Դ�InputStream,Ҳ���Դ�Reader
		//System.out.println(prop);
		prop.setProperty("name", "shiqiaoqiao");
		prop.store(new FileOutputStream("config.properties"), null);	//д;���Դ�OutputStream,Ҳ���Դ�Writer,comments�Ƕ��б����������,���Ը�ֵ,Ҳ���Ը�null
	}

	private static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "����");
		prop.setProperty("age", "20");
		//System.out.println(prop);
		
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();			//��ȡ���м��ļ���
		
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}

	private static void demo1() {
		Properties prop = new Properties();
		prop.put("����", 23);
		
		System.out.println(prop);
	}

}
