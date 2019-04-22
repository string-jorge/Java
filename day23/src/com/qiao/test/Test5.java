package com.qiao.test;

/*
 * 斐波那契数列
 * 1 1 2 3 5 8 13 21
 */
public class Test5 {
	public static void main(String[] args) {
		//demo1();
		System.out.println(fun(8));
	}
	public static int fun(int num) {
		if(num == 1 || num == 2) {
			return 1;
		} else {
			return fun(num - 2) + fun(num - 1);
		}
	}
	public static void demo1() {
		//用数组做斐波那契数列
		int[] arr = new int[8];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		System.out.println(arr[arr.length - 1]);
	}
}
