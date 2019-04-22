package com.qiao.test;

import java.util.Arrays;

public class Test1 {

	/**
	 * 需求:我们有如下的字符串:"91 27 46 38 50",请写代码实现最终显示结果是:"27 38 46 50 91"
	 * 
	 * 分析:
	 * 		1.将字符串切割成字符串数字
	 * 		2.将字符串转换成数字并将其存储在一个等长度的int数组中
	 * 		3.排序
	 * 		4.将排序后的结果遍历并拼接成一个字符串
	 */
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		//1.将字符串切割成字符串数字
		String[] sArr = s.split(" ");
		
		//2.将字符串转换成数字并将其存储在一个等长度的int数组中
		int[] arr = new int[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);//将数字字符串转换成数字
		}
		
		//3.排序
		Arrays.sort(arr);
		
	/*	//费内存
	 * //4.将排序后的结果遍历并拼接成一个字符串
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				str = str + arr[i];
			}else {
				str = str + arr[i] + " ";
			}
		}
		System.out.println(str);*/
		//不费内存推荐
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i] + " ");
			}
		}
		System.out.println(sb);
	}

}
