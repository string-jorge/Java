package com.qiao.otherclass;

public class Test3_System {

	/**
	 * A:System��ĸ���
	 * 		System�����һЩ���õ����ֶκͷ���.�����ܱ�ʵ����
	 * B:��Ա����
	 * 		public static void gc():��������������
	 * 		public static void exit(int status):�˳�JVM
	 * 		public static long currentTimeMillis():��ȡ��ǰʱ��ĺ���ֵ
	 * 		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
	}

	private static void demo4() {
		//���������ݿ���
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		System.out.println("---------------------");
		System.arraycopy(src, 0, dest, 0, src.length);
		
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

	private static void demo3() {
		//��ȡ��ǰʱ��ĺ���ֵ
		long start = System.currentTimeMillis();//��ʼ��ʱ��,��ȡ��ǰʱ��ĺ���ֵ
		for(int i = 0;i <= 1000;i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();//������ʱ��
		System.out.println(end - start);//�������е�ʱ��
	}

	private static void demo2() {
		//�˳�JVM
		System.exit(0);//��0״̬���쳣��ֹ,�˳�JVM
		System.out.println("123");//��ִ��
	}

	private static void demo1() {
		//��������������
		for(int i = 0; i < 100;i++) {
			new Test();
			System.gc();//��������������
		}
	}
}

class Test {//��һ��Դ�ļ��в�������������public���ε���

	@Override
	public void finalize() {
		System.out.println("��������ɨ��");
	}
	
}