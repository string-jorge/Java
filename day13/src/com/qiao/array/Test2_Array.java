package com.qiao.array;

public class Test2_Array {

	/**
	 * 数组高级二分法查找代码
	 * 	注意事项:使用二分法查找,数组必须是有序的
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77,88};
		System.out.println(getIndex(arr,11));
		System.out.println(getIndex(arr,22));
		System.out.println(getIndex(arr,77));
		System.out.println(getIndex(arr,44));
		System.out.println(getIndex(arr,99));
	}
	/*
	 * 二分查找
	 * 1.返回值类型是索引int
	 * 2.参数列表int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value) {
		int min = 0;
		int max = arr.length-1;
		int mid = (min + max) / 2;
		
		while(arr[mid] != value) {//当中间值不等于要找的值,就开始循环查找
			if(value < arr[mid]) {//当中间值小于要找的值
				max = mid - 1;//最小的索引改变
			}else if(value > arr[mid]) {//当中间值大于要找的值
				min = mid + 1;//最大索引改变
			}
			mid = (min + max) / 2;//无论是大还是小改变,中间索引都会随之改变
			
			if(min > max) {//如果最小索引大于最大索引,就没有查找的可能性了
				return -1;//返回-1
			}
		}
		return mid;
	}
}
