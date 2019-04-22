package com.qiao.File;

import java.io.File;

public class Test3_FileMethod {

	/**
	 * A:重命名和删除功能
	 * 		public boolean renameTo(File dest);:把文件重名名为指定的路径
	 * 		public boolean delete();:删除文件或者文件夹
	 * B:重命名注意事项
	 * 		如果路径相同,就是改名
	 * 		如果路径名不同,就是改名并剪切
	 * C:删除注意事项
	 * 		Java中的删除不走回收站
	 * 		要删除一个文件夹,请注意文件夹内不能包含文件或者文件夹
	 */
	public static void main(String[] args) {
		//demo1();
		File file1 = new File("yyy.txt");
		System.out.println(file1.delete());
		
		File file2 = new File("aaa");
		System.out.println(file2.delete());
		
		File file3 = new File("ccc");
		System.out.println(file3.delete());//false,如果删除文件夹,那么文件夹必须是空的
	}

	private static void demo1() {
		File file1 = new File("ooo.txt");
		File file2 = new File("D:\\xxx.txt");
		System.out.println(file1.renameTo(file2));
	}

}
