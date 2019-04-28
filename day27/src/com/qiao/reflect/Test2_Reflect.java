package com.qiao.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test2_Reflect {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));		//读取配置文件上的全类名
		Class clazz = Class.forName(br.readLine());			//通过全类名过去字节码文件对象
		Fruit f = (Fruit) clazz.newInstance();				//通过字节码文件对象获取实例(创建对象,空参)
		Juicer j = new Juicer();
		j.run(f);
	}

}

interface Fruit {
	public void squeeze();
}

class Apple implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯苹果汁儿");
	}
}

class Orange implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯橘子汁儿");
	}
}

class Juicer {
	public void run(Fruit f) {
		f.squeeze();
	}
}