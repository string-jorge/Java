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
	 * Properties是Hashtable的子类
	 * Properties类表示了一个持久的属性集
	 * Properties可以保存在流中或从流中加载
	 * 属性列表中的每一个键及其对应值都是一个字符串
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//demo1();
		//demo2();
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));			//读;可以传InputStream,也可以传Reader
		//System.out.println(prop);
		prop.setProperty("name", "shiqiaoqiao");
		prop.store(new FileOutputStream("config.properties"), null);	//写;可以传OutputStream,也可以传Writer,comments是对列表参数的描述,可以给值,也可以给null
	}

	private static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "张三");
		prop.setProperty("age", "20");
		//System.out.println(prop);
		
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();			//获取所有键的集合
		
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}

	private static void demo1() {
		Properties prop = new Properties();
		prop.put("张三", 23);
		
		System.out.println(prop);
	}

}
