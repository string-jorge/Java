package com.qiao.collection;

import com.qiao.bean.Student;

public class Test1_Array {

	/**
	 * �����ѧ������Ϣ�洢��������,����������,��ȡ��ÿ��ѧ������Ϣ
	 */
	public static void main(String[] args) {
		//int[] arr = new int[5];��������������������
		Student[] arr = new Student[5];//��������������������
		arr[0] = new Student("����",23);//����һ��ѧ������,�洢������ĵ�һ��λ��(arr[0]�д洢����ѧ������ĵ�ֵַ,ͨ����ֵַ�ҵ�ѧ������ʵ��)
		arr[1] = new Student("����",24);//����һ��ѧ������,�洢������ĵڶ���λ��
		arr[2] = new Student("����",25);//����һ��ѧ������,�洢������ĵ�����λ��
		arr[3] = new Student("����",26);//����һ��ѧ������,�洢������ĵ��ĸ�λ��
		arr[4] = new Student("���",30);//����һ��ѧ������,�洢������ĵ����λ��
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
