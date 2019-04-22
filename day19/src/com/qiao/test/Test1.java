package com.qiao.test;

public class Test1 {

	/**
	 * 面试题1:
	 * 		final,finally和finalize的区别
	 * 		final修饰类,类不能被继承
	 * 		final修饰方法,方法不能被重写
	 * 		final修饰变量,变量只能赋值一次
	 * 
	 * 		finally时try语句中的语句体,不能单独使用,用来释放资源
	 * 
	 * 		finalize是一个方法,当垃圾回收器确定不存在对该对象的更对引用时,由对象的垃圾回收器调用此方法.
	 * 面试题2:
	 * 		如果catch里面有return语句,请问finally的代码还会执行吗?如果会,请问是在return前还是return后.
	 */
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.method());
	}

}

class Test {
	public int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1 / 0);
			return x;
		} catch (Exception e) {
			x = 30;
			return x;
		} finally {
			x = 40;
			//return x;	//千万不要再finally里面写返回语句,因为finally的作用是为了释放资源,是肯定会执行的
			//如果在这里面写返回语句,那么try和catch的结果都会被改变,所以这么写就是犯罪
		}
	}
}