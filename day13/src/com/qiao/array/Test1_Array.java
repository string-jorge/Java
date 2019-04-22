package com.qiao.array;

public class Test1_Array {

	/**
	 * 1.����߼�ð���������:
	 * ����ϸ�,�����½�
	 * ��������λ�ñȽ�,���ǰ���Ԫ�رȺ����Ԫ�ش�ͻ�λ��
	 * 2.����߼�ѡ���������:
	 * С����ǰ��,����ں���
	 * ��һ�������ϵ�Ԫ��,��������������λ���ϵ�Ԫ�رȽ�
	 */
	public static void main(String[] args) {
		int[] arr = {9,5,6,7,1,3,2,4,8,0};
		//bubbleSort(arr);
		celectSort(arr);
		print(arr);
	}

	/*
	 * ð������
	 * 1.����ֵ����,void
	 * 2.�����б�,int[] arr
	 * 
	 * ��һ��:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3],arr[3]��arr[4]�Ƚ�4��
	 * �ڶ���:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3]�Ƚ�3��
	 * ������:arr[0]��arr[1],arr[1]��arr[2]�Ƚ�2��
	 * ���Ĵ�:arr[0]��arr[1]�Ƚ�1��
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {//��ѭ��ֻ��Ҫ�Ƚ�arr.length-1�ξͿ�����
			for (int j = 0; j < arr.length - 1 - i; j++) {//-1��Ϊ�˷�ֹ����Խ��,-i��Ϊ�����Ч��
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
	 * ѡ������
	 * 1.����ֵ����void
	 * 2.�����б�int[]arr
	 * 
	 * ��һ��:arr[0]�ֱ���arr[1-4]�Ƚ�,�Ƚ�4��
	 * �ڶ���:arr[1]�ֱ���arr[2-4]�Ƚ�,�Ƚ�3��
	 * ������:arr[2]�ֱ���arr[3-4]�Ƚ�,�Ƚ�2��
	 * ���Ĵ�:arr[3]��arr[4]�Ƚ�,�Ƚ�1��
	 */
	public static void celectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {//��ѭ��ֻ��Ҫ�Ƚ�arr.length-1��
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
	 * ��ӡ����
	 * 1.����ֵ����void
	 * 2.�����б�int[]arr
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/*
	 * ��λ����
	 * 1.����ֵ����void
	 * 2.�����б�int arr[],int i,int j
	 */
	private static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
