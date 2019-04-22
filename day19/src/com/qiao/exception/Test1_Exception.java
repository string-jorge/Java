package com.qiao.exception;

public class Test1_Exception {

	/**
	 * A:JVM默认是如何处理异常的
	 * mian函数收到这个问题时,有两种处理方式:
	 * a:自己将该问题处理,然后继续运行
	 * B:自己没有针对的处理方式,只有交给调用main的jvm来处理
	 * jvm有个默认的异常处理机制,就将该异常进行处理
	 * 并将该异常的名称,异常的信息,异常出现的位置打印在了控制台上,同时将程序停止运行
	 * B:案例演示
	 * 		JVM默认如何处理异常
	 */
	public static void main(String[] args) {
		//demo1();
		Test1 t = new Test1();
		int i = t.div(10, 0);
		System.out.println(i);
	}

	private static void demo1() {
		int[] arr = {11,22,33,44,55};
		arr = null;
		System.out.println(arr[0]);//空指针异常
		System.out.println(arr[10]);//数组索引越界异常
	}

}
class Test1 {
	public int div(int a,int b) {		//a = 10,b = 0
		return a/ b;					// 10 / 0 被除数是10,除数是0,当除数是0的时候违背了算术运算法则,抛出该异常
										//new ArithmeticException( / by zero);
	}
}