package com.qiao.otherclass;

import java.util.Random;

public class Test2_Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		/*int x  =  r.nextInt();
		System.out.println(x);*/
		
		for(int i = 0;i < 10;i++) {
			//System.out.println(r.nextInt());
			System.out.println(r.nextInt(100));//掌握,生成在0到n范围内的随机数,包含0不包含n
		}
		
		 /** -1244746321
		 * 1060493871
		 
		Random r2 = new Random(1000);
		
		int a = r2.nextInt();
		int b = r2.nextInt();
		
		System.out.println(a);
		System.out.println(b);*/
	}

}
