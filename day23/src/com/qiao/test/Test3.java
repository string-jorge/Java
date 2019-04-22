package com.qiao.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	/**
	 * @param args
	 * 从键盘接受两个文件夹路径,把其中的一个文件夹中(包容内容)拷贝到另外一个文件夹中
	 * 
	 * 把其中一个文件夹中(包容内容)拷贝到另外一个文件夹中
	 * 分析
	 * 1.在目标文件夹中创建原文件
	 * 2.获取原文件夹中所有的文件和文件夹,存储在File数组中
	 * 3.遍历数组
	 * 4.如果是文件就用IO流读写
	 * 5.如果是文件夹就递归调用
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File src = Test1.getDir();
		File dest = Test1.getDir();
		copy(src,dest);
	}

	public static void copy(File src, File dest) throws IOException {
		//在目标文件夹中创建原文件
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		//获取原文件夹中所有的文件和文件夹,存储在File数组中
		File[] subFiles = src.listFiles();
		//遍历数组
		for (File subFile : subFiles) {
			//如果是文件就用IO流读写
			if(subFile.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newDir, subFile.getName())));
				
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			//如果是文件夹就递归调用
			} else {
				copy(subFile,newDir);
			}
		}
	}
}
