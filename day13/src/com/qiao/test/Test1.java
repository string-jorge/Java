package com.qiao.test;

public class Test1 {

	/**
	 * �������е����ݰ���ָ����ʽƴ�ӳ��ַ���
	 * 		����:
	 * 			int[] arr = {1,2,3};
	 * 		������:
	 * 			"[1,2,3]"
	 * 		��StringBuffer�Ĺ���ʵ��
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arrayToString(arr));
	}
	/*
	 * ������ת��Ϊ�ַ���
	 * 1.����ֵ����String
	 * 2.�����б�int[]
	 */
	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();//�����ַ�������������
		sb.append("[");//��[��ӵ�������
		//{1,2,3}
		for (int i = 0; i < arr.length; i++) {//��������
			//sb.append(arr[i] + ", ");//������û��]
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");//[1, 2, 3]
			}else{
				sb.append(arr[i]).append(", ");//[1, 2, 
			}
		}
		return sb.toString();//��StringBufferת��ΪString����
	}
}
