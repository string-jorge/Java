package com.qiao.thread;

import java.io.IOException;

public class Test2_RunTime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();		//获取运行时对象
		//r.exec("shutdown -s -t 300");			//再单独的进程中执行指定的字符串命令,300秒后注销用户
		r.exec("shutdown -a");					//取消注销
	}

}
