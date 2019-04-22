package com.qiao.File;

import java.io.File;

public class Test1_File {

	/**
	 * File类的构造
	 * File(String pathname):根据一个路径得到File对象
	 * File(String parent,String child):根据一个目录和一个子文件/目录得到File对象
	 * File(File parent,String child):根据一个父File对象和一个子文件/目录得到File对象
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		File parent = new File("D:\\Teaching Video\\JavaSE\\day01\\video");
		String child = "01.01_计算机基础知识(计算机概述).avi";
		File file = new File(parent,child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	private static void demo2() {
		String parent = "D:\\Teaching Video\\JavaSE\\day01\\video";
		String child = "01.01_计算机基础知识(计算机概述).avi";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	private static void demo1() {
		File file1 = new File("D:\\Teaching Video\\JavaSE\\day01\\video\\01.01_计算机基础知识(计算机概述).avi");
		System.out.println(file1.exists());//true
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());//true
		
		File file3 = new File("yyy.txt");
		System.out.println(file3.exists());//false
	}

}
