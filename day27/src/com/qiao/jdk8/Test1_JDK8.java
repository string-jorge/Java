package com.qiao.jdk8;

public class Test1_JDK8 {

	/**
	 * @param args
	 * ˵��:
	 * 		eclipse��jdk8��֧�����Դ����д�,ʹ�������������������������
	 * JDK8��������:
	 * 		1.�ӿ�����Զ����з�����ķ���,�Ǿ�̬������Ҫ��default����,��̬�ľͲ���
	 * 		2.JDK8,��Ա����ǰ���final����ʡ��(���ֲ��ڲ���Ҫʹ�þֲ�����ʱ)
	 */
	public static void main(String[] args) {
		/*Test t = new Test();
		t.print();
		
		Inter.method();
		
		Test t2 = new Test();
		t2.run();*/
	}

}
/*interface inter {
	public default void print() {
		System.out.println("Hello World");
	}
	
	public static void method() {
		System.out.println("static method");
	}
}

class Test implements inter{
	public void run() {
		int num = 10;			//JDK8,ǰ���final����ʡ��
		class Inner {
			public void fun() {
				System.out.println("fun");
			}
		}
		Inner i = new Inner();
		i.fun();
	}
}*/