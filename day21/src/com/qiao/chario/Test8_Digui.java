package com.qiao.chario;

public class Test8_Digui {

	/**
	 * �ݹ���5!
	 * 
	 * �ݹ�ı׶�:���ܵ��ô�������,���׵���ջ�ڴ����
	 * �ݹ�ĺô�:����֪��ѭ���Ĵ���
	 * 
	 * ���췽���Ƿ���Եݹ����?
	 * ���췽������ʹ�õݹ����
	 * 
	 * �ݹ�����Ƿ�����з���ֵ
	 * ��һ��(������Ҳ����û��)
	 */
	public static void main(String[] args) {
		/*int result = 1;
		for(int i = 1;i < 6;i++) {
			result *= i;
		}
		System.out.println(result);*/
		System.out.println(fun(5));
		}
	public static int fun(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * fun(num - 1);
		}
	}	

}
