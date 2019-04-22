package com.qiao.File;

import java.io.File;

public class Test1_File {

	/**
	 * File��Ĺ���
	 * File(String pathname):����һ��·���õ�File����
	 * File(String parent,String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
	 * File(File parent,String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		File parent = new File("D:\\Teaching Video\\JavaSE\\day01\\video");
		String child = "01.01_���������֪ʶ(���������).avi";
		File file = new File(parent,child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	private static void demo2() {
		String parent = "D:\\Teaching Video\\JavaSE\\day01\\video";
		String child = "01.01_���������֪ʶ(���������).avi";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	private static void demo1() {
		File file1 = new File("D:\\Teaching Video\\JavaSE\\day01\\video\\01.01_���������֪ʶ(���������).avi");
		System.out.println(file1.exists());//true
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());//true
		
		File file3 = new File("yyy.txt");
		System.out.println(file3.exists());//false
	}

}
