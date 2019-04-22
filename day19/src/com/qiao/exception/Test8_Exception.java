package com.qiao.exception;

public class Test8_Exception {

	/**
	 * A:为什么需要自定义异常
	 * 		通过名字区分到底是什么异常,有针对的解决办法
	 * 		举例:人的年龄
	 * B:自定义异常的概述
	 * 		继承自Exception
	 * 		继承自RuntimeException
	 * C:自定义异常的基本使用
	 */
	public static void main(String[] args) {
	}
}
class AgeOutOfBoundsException extends Exception {//自定义年龄不合法异常

	public AgeOutOfBoundsException() {
		super();
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
	}
	
}