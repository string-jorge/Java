package com.qiao.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test2_Reflect {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));		//��ȡ�����ļ��ϵ�ȫ����
		Class clazz = Class.forName(br.readLine());			//ͨ��ȫ������ȥ�ֽ����ļ�����
		Fruit f = (Fruit) clazz.newInstance();				//ͨ���ֽ����ļ������ȡʵ��(��������,�ղ�)
		Juicer j = new Juicer();
		j.run(f);
	}

}

interface Fruit {
	public void squeeze();
}

class Apple implements Fruit {
	public void squeeze() {
		System.out.println("ե��һ��ƻ��֭��");
	}
}

class Orange implements Fruit {
	public void squeeze() {
		System.out.println("ե��һ������֭��");
	}
}

class Juicer {
	public void run(Fruit f) {
		f.squeeze();
	}
}