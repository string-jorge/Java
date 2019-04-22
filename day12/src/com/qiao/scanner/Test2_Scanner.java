package com.qiao.scanner;

import java.util.Scanner;

public class Test2_Scanner {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//键盘录入两个int类型数
		/*System.out.println("请输入第一个整数:");
		int i = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int j = sc.nextInt();
		System.out.println("i = " + i + ",j = " + j);*/
	
		//键盘录入两个字符串
		/*System.out.println("请输入第一个字符串:");
		String line1 = sc.nextLine();
		System.out.println("请输入第二个字符串:");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + ",line2 = " + line2);*/
		
		/*
		 * nextInt()是键盘录入整数的方法,当我们录入10的时候其实在键盘上录入的是10和\r\n,nextInt()方法只获取10就结束了
		 * nextLine()是键盘录入字符串的方法,可以接受任意类型,但是他凭什么获取一行呢?
		 * 通过\r\n,只要遇到\r\n就证明一行结束
		 */
		
		//键盘录入一个int类型的数和一个字符串
		/*System.out.println("请输入一个数:");
		int x = sc.nextInt();
		System.out.println("请输入一个字符串:");
		String line = sc.nextLine();
		System.out.println("x = " + x + ",line = " + line);
		System.out.println(x);
		System.out.print("123456789");
		System.out.print(line);
		System.out.println("9876564321");*/
		
		/*
		 * 解决方案
		 * 1.创建两次对象,但是浪费空间
		 * 2.键盘录入的都是从字符串,都有nextLine方法,将整数字符串转换成整数的方法(建议的方法)
		 */
		
		int x = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.next();
		System.out.println(x);
		System.out.println(line);
	}

}
