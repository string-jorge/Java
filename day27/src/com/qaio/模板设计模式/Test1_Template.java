package com.qaio.ģ�����ģʽ;

public class Test1_Template {

	/**
	 * @param args
	 * ģ�����ģʽ
	 * 		A:�ŵ�
	 * 			ʹ��ģ�巽��ģʽ,�ڶ����㷨�Ǽܵ�ͬʱ,���Ժ�����ʵ�־�����㷨,�����û�����������
	 * 		B:ȱ��
	 * 			����㷨�Ǽ����޸ĵĻ�,����Ҫ�޸ĳ�����	
	 */
	public static void main(String[] args) {
		/*long start = System.currentTimeMillis();			//��ȡ��ǰʱ�����ֵ
		for (int i = 0; i < 1000000; i++) {
			System.out.println("x");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);*/
		Demo d = new Demo();
		System.out.println(d.getTime());
	}

}

abstract class GetTime {
	public final long getTime() {
		long start = System.currentTimeMillis();			//��ȡ��ǰʱ�����ֵ
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code();
}

class Demo extends GetTime {

	@Override
	public void code() {
		int i = 0;
		while(i < 100000) {
			System.out.println("x");
			i++;
		}
	}
	
}