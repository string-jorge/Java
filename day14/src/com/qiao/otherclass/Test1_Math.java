package com.qiao.otherclass;

public class Test1_Math {

	/**
	 * A:Math�ĸ���
	 * 		Math���������ִ�л�����ѧ����ķ���,�����ָ��,����,ƽ���������Ǻ���
	 * B:��Ա����
	 * 		public static int abs(int a):ȡ����ֵ
	 * 		public static double ceil(double a):ceil���컨�����˼;����ȡ��,��һ��
	 * 		public static double floor(double a):floor�ǵذ����˼;����ȡ��,��β��
	 * 		public static int max(int a,int b):ȡ�ϴ�ֵ
	 * 		public static int min(int a,int b):ȡ��Сֵ
	 * 		public static double pow(double a,double b):2.0 ^ 3.0,ǰ����ǵ���,�������ָ��
	 * 		public static double random():�������0.0 - 1.0֮���С��;����ͷ,������β
	 * 		public static int round(float a):�������뷨
	 * 		public static double sqrt(double a):��ƽ����
	 */
	public static void main(String[] args) {
		//Բ����
		System.out.println(Math.PI);//3.141592654...Բ����
		
		//ȡ����ֵ
		System.out.println(Math.abs(-10));//10
		System.out.println(Math.abs(10));//10
		
		//��һ��
		System.out.println(Math.ceil(12.3));//13.0
		
		//��β��
		System.out.println(Math.floor(12.3));//12.0
		
		//ȡ�ϴ�ֵ
		System.out.println(Math.max(20,30));//30
		
		//ȡ��Сֵ
		System.out.println(Math.min(20, 30));//20
		
		//����,ǰ����ǵ���,�������ָ��
		System.out.println(Math.pow(2.0, 3.0));//2.0 ^ 3.0 = 8.0,����double����
		
		//�������0.0 - 1.0֮���С��;����ͷ,������β
		System.out.println(Math.random());//���������
		
		//��������
		System.out.println(Math.round(12.3f));//12,float����
		System.out.println(Math.round(12.9f));//13,float����
		System.out.println(Math.round(12.3));//12,double����
		System.out.println(Math.round(12.9));//13,double����
		
		//��ƽ����
		System.out.println(Math.sqrt(4));//2.0
		System.out.println(Math.sqrt(3));//1.732...
	}

}
