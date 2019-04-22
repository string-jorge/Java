package com.qiao.File;

import java.io.File;

public class Test4_FileMethod {

	/**
	 * A:�жϹ���
	 * 		public boolean isDirectory():�ж��Ƿ���Ŀ¼
	 * 		public boolean isFile():�ж��Ƿ����ļ�
	 * 		public boolean exists():�ж��Ƿ����
	 * 		public boolean canRead():�ж��Ƿ�ɶ�
	 * 		public boolean canWrite():�ж��Ƿ��д
	 * 		public boolean isHidden():�ж��Ƿ�����
	 */
	public static void main(String[] args) {
		//demo1();
		File file1 = new File("zzz");
		file1.setReadable(false);//���ò��ɶ�
		System.out.println(file1.canRead());//�ж��Ƿ�ɶ�,windowsϵͳ��Ϊ���е��ļ����ǿɶ���
		file1.setWritable(false);//���ò���д
		System.out.println(file1.canWrite());//�ж��Ƿ��д,windowsϵͳ��������Ϊ����д
		
		File file2 = new File("aaa.txt");
		System.out.println(file2.isHidden());//�ж��Ƿ�����
		System.out.println(file1.isHidden());
	}

	private static void demo1() {
		File dir1 = new File("ccc");
		System.out.println(dir1.isDirectory());//true,�ж��Ƿ����ļ���
		
		File dir2 = new File("zzz");
		System.out.println(dir2.isDirectory());//false
		
		System.out.println(dir1.isFile());//false,�ж��Ƿ����ļ�
		System.out.println(dir2.isFile());//true
		
		System.out.println(dir1.exists());//�ж��Ƿ����
	}

}
