package com.qiao.test;

public class Test5 {

	/**
	 * ����:�������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
	 * 		����:
	 * 			int[] arr = {1,2,3};
	 * 		������:
	 * 			"[1, 2, 3]"
	 * ����:
	 * 1.��Ҫ����һ���ַ���"["
	 * 2.���������е�ÿһ��Ԫ��
	 * 3.���ַ����������е�Ԫ�ؽ���ƴ��
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s = "[";//����һ���ַ��������������е�Ԫ��ƴ��
		
		for (int i = 0; i < arr.length; i++) {//{1,2,3},�����������
			if(i == arr.length - 1) {//�ж��ǲ������һ��Ԫ��
				s = s + arr[i] + "]";//"[1, 2, 3]"
			}else {
			s = s + arr[i] + ", ";//"[1, 2, "
			}
		}
		System.out.println(s);
	}
}
