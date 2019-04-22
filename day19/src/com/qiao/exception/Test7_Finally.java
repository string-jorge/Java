package com.qiao.exception;

public class Test7_Finally {

	/**
	 * A:finally的特点
	 * 		被finally控制的语句体一定会执行
	 * 		特殊情况:在执行finally之前退出了JVM(比如System.exit(0);)
	 * B:finally的作用
	 * 		用于释放资源,在IO流操作和数据库操作中会见到
	 * 
	 * return语句相当于是方法的最后一口气,那么他在将死之前会看一看有没有finally帮其完成遗愿,如果有就将finally执行后再彻底返回
	 */
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("除数不能为零");
			System.exit(0);						//退出JVM虚拟机
			return;
		} finally {
			System.out.println("finally执行了");
		}
	}

}
