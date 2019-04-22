package com.qiao.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5_FileMethod {

	/**
	 * A:获取功能
	 * 		public String getAbsolutePath():获取绝对路径
	 * 		public String getPath():获取路径
	 * 		public String getName():获取名称
	 * 		public long length():获取长度:字节数
	 * 		public long lastModified():获取最后一次修改时间,毫秒值
	 * 		public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	 * 		public File[] listFiles():获取指定目录下的所有问价或者文件夹的File数组
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		File dir = new File("D:\\Teaching Video\\JavaSE\\day01\\video");
		String[] arr = dir.list();					//仅为了获取文件名
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();			//获取文件对象
		for (File file : subFiles) {
			System.out.println(file);
		}
	}

	private static void demo1() {
		File file1 = new File("ccc.txt");
		File file2 = new File("D:\\practice\\Java\\eclipse\\day19\\ccc.txt");
		//System.out.println(file1.getAbsoluteFile());//取绝对路径
		//System.out.println(file2.getAbsolutePath());
		
		//System.out.println(file1.getPath());		//获取构造方法中传入的路径
		//System.out.println(file2.getPath());
		
		//System.out.println(file1.getName());		//获取文件或者文件夹的名字
		//System.out.println(file2.getName());
		
		//System.out.println(file1.length());			//获取长度:字节数
		
		System.out.println(file1.lastModified());		//获取最后一次修改时间,毫秒值
		Date d = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}
