package com.qiao.exception;

import java.io.FileInputStream;

public class Test4_Exception {

	/**
	 * 编译时异常
	 * 		Java程序必须显示处理,否则程序就会发生错误,无法通过编译
	 * 运行时异常
	 * 		无需显示处理,也可以和编译时异常一样处理
	 * 案例演示
	 * 		编译期异常和运行期异常的区别
	 * 
	 * 编译时异常也叫未雨绸缪异常(自定义)
	 * 		未雨绸缪:在做某些事情的时候要做某些准备
	 * 
	 * 		编译时异常:在编译某个程序的时候,有可能会有这样那样的事情发生,比如找不到文件,这样的异常就必须在编译的时候处理
	 * 如果不处理编译通不过
	 * 
	 * 		运行时异常:就是程序员所犯的错误,需要回来修改代码
	 */
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("xxx.txt");
		} catch(Exception e) {
			
		}
	}

}
