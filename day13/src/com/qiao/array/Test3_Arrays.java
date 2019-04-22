package com.qiao.array;

import java.util.Arrays;

public class Test3_Arrays {

	/**
	 * public static String toString(int[] arr):������ת���ַ���
	 * public static void sort(int[] arr):����������
	 * public static int binarySearch(int[] a,int key):����������Ԫ��
	 * 
	 * toStringԴ��:
	 * public static String toString(int[] a) {
        	if (a == null)//��������������null
            	return "null";//����null
        	int iMax = a.length - 1;//iMax���������
        	if (iMax == -1)//���������û��Ԫ��
            	return "[]";//����[]

        	StringBuilder b = new StringBuilder();//StringBuilder�̲߳���ȫ,Ч�ʸ�
        	b.append('[');//��[��ӵ��ַ�����������
        	for (int i = 0; ; i++) {//��������,�ж����û��д,Ĭ����true
            	b.append(a[i]);//��ӵ�һ��Ԫ�ص��ַ���������
            	if (i == iMax)//�������ֵ�����������ֵ
                	return b.append(']').toString();//��]��ӵ��ַ���������,��ת�����ַ���������
            	b.append(", ");//�����������������ͽ�, ��ӵ��ַ�������
        	}
    	}
    	
    	//binarySearchԴ��:
    	private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        	int low = fromIndex;//��С����0
        	int high = toIndex - 1;//�������,���鳤��-1

        	while (low <= high) {//��С����С�ڵ��������������ѭ���ж�
            	int mid = (low + high) >>> 1;//����м�����ֵ,(��С+���)/2
            	int midVal = a[mid];//ͨ���м�������ȡ�м�ֵ

            	if (midVal < key)//�м�������Ӧ��ֵС�ڲ��ҵ�ֵ
                	low = mid + 1;//��С�����仯
           		else if (midVal > key)//�м�������Ӧ��ֵ���ڲ��ҵ�ֵ
                	high = mid - 1;//��������仯
            	else
                	return mid; // key found//�ҵ���
        	}
        	return -(low + 1);  // key not found.//û�ҵ�,���Ĳ����-1
    	}
	 */
	public static void main(String[] args) {
		int[] arr1 = {33,22,11,44,66,55};
		System.out.println(Arrays.toString(arr1));//����ת�ַ���
		
		Arrays.sort(arr1);//����
		System.out.println(Arrays.toString(arr1));//�����ת�ַ�����ӡ
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9};//���������������������
		System.out.println(Arrays.binarySearch(arr2, 7));//���������е�Ԫ��
		System.out.println(Arrays.binarySearch(arr2,0));//���Ĳ����-1
	}
}
