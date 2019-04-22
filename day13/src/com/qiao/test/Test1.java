package com.qiao.test;

public class Test1 {

	/**
	 * 把数组中的数据按照指定格式拼接成字符串
	 * 		举例:
	 * 			int[] arr = {1,2,3};
	 * 		输出结果:
	 * 			"[1,2,3]"
	 * 		用StringBuffer的功能实现
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arrayToString(arr));
	}
	/*
	 * 将数组转换为字符串
	 * 1.返回值类型String
	 * 2.参数列表int[]
	 */
	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();//创建字符串缓冲区对象
		sb.append("[");//将[添加到缓冲区
		//{1,2,3}
		for (int i = 0; i < arr.length; i++) {//遍历数组
			//sb.append(arr[i] + ", ");//这样做没有]
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");//[1, 2, 3]
			}else{
				sb.append(arr[i]).append(", ");//[1, 2, 
			}
		}
		return sb.toString();//将StringBuffer转化为String返回
	}
}
