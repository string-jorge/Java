package com.qiao.test;

import java.util.Scanner;

public class Test1 {

	/**
	 * A:需求:
	 * 		1.模拟登陆,给三次机会,并提示还有几次
	 * 		2.用户名和密码都是admin
	 * B:分析:
	 * 		1.模拟登陆,需要键盘录入,Scanner
	 * 		2.给三次机会,需要循环,for
	 * 		3.并提示有几次,需要判断,if
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//创建键盘录入对象
		for(int x = 1;x <= 3;x++){//给三次机会
			System.out.println("请输入用户名:");
			String userName = sc.nextLine();//记录录入的用户名
			System.out.println("请输入密码:");
			String passWord = sc.nextLine();//记录录入的密码
		
			if("admin".equals(userName) && "admin".equals(passWord)) {//判断用户名和密码是否正确
				System.out.println("欢迎");
				break;//正确跳出循环
			}else{
				if(x == 3) {
					System.out.println("您输错的次数过多,请明天再来!");
				}else{
					System.out.println("用户名或密码错误!" + "您还有" + (3-x) + "次机会");
				}
			}
		}
	}
}
