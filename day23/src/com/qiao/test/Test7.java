package com.qiao.test;

public class Test7 {

	/**
	 * 求1000阶乘的尾部零的个数  = 249
	 * 每逢:	5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 ... 1000			1000 / 5 = 200
	 * 5 * 5 * 1	5 * 5 * 2	5 * 5 * 3	5 * 5 * 4	5 * 5 * 5 ... 5 * 5 * 40			200 / 5 = 40
	 * 5 * 5 * 5 * 1	5 * 5 * 5 * 2	5 * 5 * 5 * 3	5 * 5 * 5 * 4 ... 5 * 5 * 5 * 8		40 / 4 = 8
	 * 5 * 5 * 5 * 5 * 1 = 625																8 / 5 = 1
	 */
	public static void main(String[] args) {
		System.out.println(fun(1000));
	}

	public static int fun(int num) {
		if(num > 0 && num < 5) {
			return 0;
		} else {
			return num / 5 + fun(num / 5);
		}
	}

}
