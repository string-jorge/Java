package com.qiao.test;

import java.io.File;


/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�,�����,��������ļ�����
 */
public class Test3 {
	public static void main(String[] args) {
		File dir = new File("E:\\");
		
//		String[] arr = dir.list();				//��ȡE�������е��ļ����ƻ����ļ�������
//		for (String string : arr) {
//			if(string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
		File[] subFiles = dir.listFiles();		//��ȡE�������е��ļ�������ļ��ж���
		
		for (File subFile : subFiles) {
			if(subFile.isFile() && subFile.getName().endsWith(".jpg")) {		//����������
				System.out.println(subFile);
			}
		}
	}
}
