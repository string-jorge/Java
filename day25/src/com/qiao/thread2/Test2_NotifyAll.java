package com.qiao.thread2;

public class Test2_NotifyAll {

	/**
	 * @param args
	 * 三个(多个)线程间的通信
	 * 
	 * 注意事项:
	 * 1.在同步代码块中,用哪个对象锁,就用那个对象调用wait方法和notify方法
	 * 2.为什么wait方法和notify方法定义在Object这个类中?
	 * 因为锁对象可以是任意对象,而Object是所有类的基类,所以wait方法和notify方法需要定义在Object这个类中
	 * 
	 * 3.sleep方法和wait方法的区别?
	 * a:slepp方法必须传入参数,参数就是时间,时间到了自动醒来
	 *   wait方法可以传入参数也可以不传入参数,传入参数就是在参数的时间结束后等待,不传入参数就是直接等待
	 * b:sleep方法再同步函数或者同步代码块中,不释放锁(睡着了也抱着锁睡)
	 *   wait方法在同步函数或者同步代码块中,释放锁  
	 */
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

class Printer2 {
	private int flag = 1;
	public void print1() throws InterruptedException {
		synchronized(this) {
			while(flag != 1) {
				this.wait();			//当前线程等待
			}
			System.out.print("他");
			System.out.print("好");
			System.out.print("我");
			System.out.print("也");
			System.out.print("好");
			System.out.print("\r\n");
			flag = 2;
			this.notifyAll();				//随机唤醒单个等待的线程
		}
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			while(flag != 2) {
				this.wait();
			}
			System.out.print("汇");
			System.out.print("源");
			System.out.print("肾");
			System.out.print("宝");
			System.out.print("片");
			System.out.print("\r\n");
			flag = 3;
			this.notifyAll();
		}
	}
	
	public void print3() throws InterruptedException {
		synchronized(this) {
			while(flag != 3) {
				this.wait();			//当前线程等待
			}
			System.out.print("真");
			System.out.print("的");
			System.out.print("好");
			System.out.print("\r\n");
			flag = 1;
			this.notifyAll();				//唤醒全部等待的线程
		}
	}
}