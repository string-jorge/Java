package com.qiao.thread;

public class Test3_Thread {

	/**
	 * @param args
	 * 实现多线线程方法一
	 * 
	 * 查看实现多线线程两种方法的源码区别:
	 * 		a:继承Thread:由于子类重写了Thread类的run(),当调用start()时,直接找子类的run()方法
	 * 		b:实现Runnable:构造函数中传入了Runnable的引用,成员变量记住了它,start()调用run()方法时内部判断成员变量Runnable的引用是否为空,
	 * 		不为空编译时看的是Runnable的run(),运行时执行的是子类的run()方法
	 * 继承Thread
	 * 		好处是:可以直接使用Thread中单run()方法,代码简单
	 * 		弊端是:如果已经有了父类,就不能用这种方法了
	 * 实现Runnable接口
	 * 		好处是:即使自己定义的线程类有了父类也没关系,因为有了父类也可以实现接口,而接口是可以多实现的
	 * 		弊端是:不能直接使用Thread中的run()方法,需要先获取到线程对象后,才能得到Thread的方法,代码复杂
	 */
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();			//4.创建Runnable的子类对象
		Thread t = new Thread(mr);					//5.将其当作参数传递给Thread的构造方法
		t.start();									//6.开启线程
		
		for (int i = 1; i < 1000; i++) {
			System.out.println("main");
		}
		
	}

}

class MyRunnable implements Runnable {				//1.定义一个类实现Runnable

	@Override
	public void run() {								//2.重写run方法
		for (int i = 1; i < 1000; i++) {			//3.将要执行的代码写在run中
			System.out.println("这是Runnable");
		}
	}
}