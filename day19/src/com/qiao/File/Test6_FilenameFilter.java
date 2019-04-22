package com.qiao.File;

import java.io.File;
import java.io.FilenameFilter;

public class Test6_FilenameFilter {

	/**
	 * �ļ����ƹ�����
	 */
	public static void main(String[] args) {
		File dir = new File("E:\\");
		
		String[] arr = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
