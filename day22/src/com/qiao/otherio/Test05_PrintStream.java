package com.qiao.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.qiao.bean.Person;

public class Test05_PrintStream {

	/**
	 * @param args
	 * @throws IOException 
	 * PrintStream和PrintWrite分别是打印的字节流和字符流
	 * 之操作数据目的的
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"),true);
		pw.println(97);				//自动刷出功能只针对println方法
		//pw.print(97);
		//pw.write(97);
		
		//pw.close();
	}

	private static void demo1() {
		System.out.println("aaa");
		PrintStream ps = System.out;		//获取标准输出流
		ps.println(97);						//底层通过Integer.toString()将97转换成字符串打印
		ps.write(97);						//查找码表,找到对应的a打印
		
		Person p1 = new Person("张三",23);	//默认调用p的toString方法
		ps.println(p1);
		
		Person p2 = null;
		System.out.println(p2);				//打印引用数据类型,如果是null,就打印null,如果不是null就打印对象的toString方法
		ps.close();
	}

}
