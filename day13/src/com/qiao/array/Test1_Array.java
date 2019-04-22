package com.qiao.array;

public class Test1_Array {

	/**
	 * 1.数组高级冒泡排序代码:
	 * 轻的上浮,沉的下降
	 * 两个相邻位置比较,如果前面的元素比后面的元素大就换位置
	 * 2.数组高级选择排序代码:
	 * 小的在前面,大的在后面
	 * 用一个索引上的元素,依次与其他索引位置上的元素比较
	 */
	public static void main(String[] args) {
		int[] arr = {9,5,6,7,1,3,2,4,8,0};
		//bubbleSort(arr);
		celectSort(arr);
		print(arr);
	}

	/*
	 * 冒泡排序
	 * 1.返回值类型,void
	 * 2.参数列表,int[] arr
	 * 
	 * 第一次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],arr[3]与arr[4]比较4次
	 * 第二次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3]比较3次
	 * 第三次:arr[0]与arr[1],arr[1]与arr[2]比较2次
	 * 第四次:arr[0]与arr[1]比较1次
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {//外循环只需要比较arr.length-1次就可以了
			for (int j = 0; j < arr.length - 1 - i; j++) {//-1是为了防止索引越界,-i是为了提高效率
				if(arr[j] > arr[j+1]){
					/*int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;*/
					swap(arr,j,j + 1);
				}
			}
		}
	}
	/*
	 * 选择排序
	 * 1.返回值类型void
	 * 2.参数列表int[]arr
	 * 
	 * 第一次:arr[0]分别与arr[1-4]比较,比较4次
	 * 第二次:arr[1]分别与arr[2-4]比较,比较3次
	 * 第三次:arr[2]分别与arr[3-4]比较,比较2次
	 * 第四次:arr[3]与arr[4]比较,比较1次
	 */
	public static void celectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {//外循环只需要比较arr.length-1次
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					/*int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;*/
					swap(arr,i,j);
				}
			}
		}
	}
	/*
	 * 打印数组
	 * 1.返回值类型void
	 * 2.参数列表int[]arr
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/*
	 * 换位操作
	 * 1.返回值类型void
	 * 2.参数列表int arr[],int i,int j
	 */
	private static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
