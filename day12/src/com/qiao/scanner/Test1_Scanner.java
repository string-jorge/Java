package com.qiao.scanner;

import java.util.Scanner;

public class Test1_Scanner {

	/**
	 * A:Scanner的概述
	 * B:Scanner的构造方法原理
	 * 		Scanner(InputStream source)
	 * 		System类下有个静态字段
	 * 			public static final InputStream in;标准的输入流,对应着键盘录入
	 * C:一般方法
	 * hasNextXxx() 判断是否还有下一个一个输入项,其中Int可以是Int,Double等.如果需要判断包含下一个字符串,则可以省略Xxx		//hasNext()判斷是否為字符串
	 * nextXxx() 获取下一个输入项,Xxx的含义和上个方法中的Xxx相同,默认情况下,Scanner使用空格,回车等作为分隔符
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//键盘录入
		//int i = sc.nextInt();//键盘录入整数存储在中
		//System.out.println(i);
		if(sc.hasNextInt()) {//判断是否为int类型的数
			int i = sc.nextInt();//如果是,就用i接受录入的数
			System.out.println(i);
		}else{//否则提示"输入类型错误"
		System.out.println("输入类型错误");
		}
	}

}
