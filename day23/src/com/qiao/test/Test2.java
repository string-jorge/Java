package com.qiao.test;

import java.io.File;

public class Test2 {

	/**
	 * @param args
	 * 键盘接收一个文件夹路径,删除该文件夹
	 * 
	 * 删除该文件夹
	 * 分析:
	 * 1.获取该文件夹下的所有的文件和文件夹
	 * 2.遍历数组
	 * 3.判断是文件直接删除
	 * 4.如果是文件夹,递归调用
	 * 5.循环结束后.把控文件夹删除
	 */
	public static void main(String[] args) {
		File dir = Test1.getDir();				//获取文件夹路径
		deleteFile(dir);
	}
	/*
	 * 删除该文件夹:
	 * 1.返回值类型void
	 * 2.参数列表File dir
	 */
	public static void deleteFile(File dir) {
		//获取该文件夹下的所有的文件和文件夹
		File[] subFiles = dir.listFiles();
		//遍历数组
		for (File subFile : subFiles) {
			//判断是文件直接删除
			if(subFile.isFile()) {
				subFile.delete();
			//如果是文件夹,递归调用
			} else {
				deleteFile(subFile);
			}
		}
		//循环结束后.把控文件夹删除
		dir.delete();
	}
}
