package com.qiao.jdk8;

public class Test1_JDK8 {

	/**
	 * @param args
	 * 说明:
	 * 		eclipse对jdk8不支持所以代码有错,使用其他软件即可正常编译运行
	 * JDK8的新特性:
	 * 		1.接口里可以定义有方法体的方法,非静态方法需要用default修饰,静态的就不用
	 * 		2.JDK8,成员变量前面的final可以省略(当局部内部类要使用局部变量时)
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
		int num = 10;			//JDK8,前面的final可以省略
		class Inner {
			public void fun() {
				System.out.println("fun");
			}
		}
		Inner i = new Inner();
		i.fun();
	}
}*/