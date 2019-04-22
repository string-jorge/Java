package com.qiao.array;

import java.util.Arrays;

public class Test3_Arrays {

	/**
	 * public static String toString(int[] arr):将数组转成字符串
	 * public static void sort(int[] arr):给数组排序
	 * public static int binarySearch(int[] a,int key):在数组里找元素
	 * 
	 * toString源码:
	 * public static String toString(int[] a) {
        	if (a == null)//如果传入的数组是null
            	return "null";//返回null
        	int iMax = a.length - 1;//iMax是最大索引
        	if (iMax == -1)//如果数组中没有元素
            	return "[]";//返回[]

        	StringBuilder b = new StringBuilder();//StringBuilder线程不安全,效率高
        	b.append('[');//将[添加到字符串缓冲区中
        	for (int i = 0; ; i++) {//遍历数组,判断语句没有写,默认是true
            	b.append(a[i]);//添加第一个元素到字符串缓冲区
            	if (i == iMax)//如果索引值等于最大索引值
                	return b.append(']').toString();//将]添加到字符串缓冲区,再转换成字符串并返回
            	b.append(", ");//如果不等于最大索引就将, 添加到字符缓冲区
        	}
    	}
    	
    	//binarySearch源码:
    	private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        	int low = fromIndex;//最小索引0
        	int high = toIndex - 1;//最大索引,数组长度-1

        	while (low <= high) {//最小索引小于等于最大索引可以循环判断
            	int mid = (low + high) >>> 1;//求出中间索引值,(最小+最大)/2
            	int midVal = a[mid];//通过中间索引获取中间值

            	if (midVal < key)//中间索引对应的值小于查找的值
                	low = mid + 1;//最小索引变化
           		else if (midVal > key)//中间索引对应的值大于查找的值
                	high = mid - 1;//最大索引变化
            	else
                	return mid; // key found//找到了
        	}
        	return -(low + 1);  // key not found.//没找到,负的插入点-1
    	}
	 */
	public static void main(String[] args) {
		int[] arr1 = {33,22,11,44,66,55};
		System.out.println(Arrays.toString(arr1));//数组转字符串
		
		Arrays.sort(arr1);//排序
		System.out.println(Arrays.toString(arr1));//排序后转字符串打印
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9};//查找数组必须是有序数组
		System.out.println(Arrays.binarySearch(arr2, 7));//查找数组中的元素
		System.out.println(Arrays.binarySearch(arr2,0));//负的插入点-1
	}
}
