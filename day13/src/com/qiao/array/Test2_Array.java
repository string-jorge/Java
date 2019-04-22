package com.qiao.array;

public class Test2_Array {

	/**
	 * ����߼����ַ����Ҵ���
	 * 	ע������:ʹ�ö��ַ�����,��������������
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
	 * ���ֲ���
	 * 1.����ֵ����������int
	 * 2.�����б�int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value) {
		int min = 0;
		int max = arr.length-1;
		int mid = (min + max) / 2;
		
		while(arr[mid] != value) {//���м�ֵ������Ҫ�ҵ�ֵ,�Ϳ�ʼѭ������
			if(value < arr[mid]) {//���м�ֵС��Ҫ�ҵ�ֵ
				max = mid - 1;//��С�������ı�
			}else if(value > arr[mid]) {//���м�ֵ����Ҫ�ҵ�ֵ
				min = mid + 1;//��������ı�
			}
			mid = (min + max) / 2;//�����Ǵ���С�ı�,�м�����������֮�ı�
			
			if(min > max) {//�����С���������������,��û�в��ҵĿ�������
				return -1;//����-1
			}
		}
		return mid;
	}
}
