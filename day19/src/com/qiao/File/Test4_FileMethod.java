package com.qiao.File;

import java.io.File;

public class Test4_FileMethod {

	/**
	 * A:判断功能
	 * 		public boolean isDirectory():判断是否是目录
	 * 		public boolean isFile():判断是否是文件
	 * 		public boolean exists():判断是否存在
	 * 		public boolean canRead():判断是否可读
	 * 		public boolean canWrite():判断是否可写
	 * 		public boolean isHidden():判断是否隐藏
	 */
	public static void main(String[] args) {
		//demo1();
		File file1 = new File("zzz");
		file1.setReadable(false);//设置不可读
		System.out.println(file1.canRead());//判断是否可读,windows系统认为所有的文件都是可读的
		file1.setWritable(false);//设置不可写
		System.out.println(file1.canWrite());//判断是否可写,windows系统可以设置为不可写
		
		File file2 = new File("aaa.txt");
		System.out.println(file2.isHidden());//判断是否隐藏
		System.out.println(file1.isHidden());
	}

	private static void demo1() {
		File dir1 = new File("ccc");
		System.out.println(dir1.isDirectory());//true,判断是否是文件夹
		
		File dir2 = new File("zzz");
		System.out.println(dir2.isDirectory());//false
		
		System.out.println(dir1.isFile());//false,判断是否是文件
		System.out.println(dir2.isFile());//true
		
		System.out.println(dir1.exists());//判断是否存在
	}

}
