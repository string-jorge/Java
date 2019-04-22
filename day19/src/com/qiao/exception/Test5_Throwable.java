package com.qiao.exception;

public class Test5_Throwable {

	/**
	 * Throwable的几个常见方法
	 * 		a:getMessage():获取异常信息,返回字符串
	 * 		b:toString():获取异常类名和异常信息,返回字符串
	 * 		c:printStackTrace():获取异常类名和异常信息,以及异常出现在程序中的位置,返回void
	 */
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {						//Exception e = new ArihtmeticException("/ by zero");
			//System.out.println(e.getMessage());		//获取异常信息
			//System.out.println(e);					//获取异常类名和异常信息
			e.printStackTrace();					//获取异常类名和异常信息,以及异常出现在程序中的位置(JVM默认处理异常的方式)
		}
	}

}
