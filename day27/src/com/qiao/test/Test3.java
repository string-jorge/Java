package com.qiao.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {

	/**
	 * @param args
	 * 已知一个类
	 * (1)写一个Properties格式的配置文件,配置类的完整名称
	 * (2)写一个程序,读取这个Properties配置文件,获得类的完整名称并加载这个类,用反射的方式运行run方法
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
