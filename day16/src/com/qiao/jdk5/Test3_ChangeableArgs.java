package com.qiao.jdk5;

public class Test3_ChangeableArgs {

	/**
	 * A:�ɱ�����ĸ���
	 * 		���巽����ʱ��֪���ö�����ٸ�����
	 * B:��ʽ
	 * 		���η� ����ֵ���� ������(��������... ������) {}
	 * C:ע������
	 * 		����ı�����ʵ��һ������
	 * 		���һ�������пɱ����,���ɶ������,��ô,�ɱ�����϶������һ��
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		print(arr);
		System.out.println("_________________");
		print(11,22,33,44,55);
	}
	
	/*public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}*/
	
	public static void print(int ... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
