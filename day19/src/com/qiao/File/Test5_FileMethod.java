package com.qiao.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5_FileMethod {

	/**
	 * A:��ȡ����
	 * 		public String getAbsolutePath():��ȡ����·��
	 * 		public String getPath():��ȡ·��
	 * 		public String getName():��ȡ����
	 * 		public long length():��ȡ����:�ֽ���
	 * 		public long lastModified():��ȡ���һ���޸�ʱ��,����ֵ
	 * 		public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	 * 		public File[] listFiles():��ȡָ��Ŀ¼�µ������ʼۻ����ļ��е�File����
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		File dir = new File("D:\\Teaching Video\\JavaSE\\day01\\video");
		String[] arr = dir.list();					//��Ϊ�˻�ȡ�ļ���
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();			//��ȡ�ļ�����
		for (File file : subFiles) {
			System.out.println(file);
		}
	}

	private static void demo1() {
		File file1 = new File("ccc.txt");
		File file2 = new File("D:\\practice\\Java\\eclipse\\day19\\ccc.txt");
		//System.out.println(file1.getAbsoluteFile());//ȡ����·��
		//System.out.println(file2.getAbsolutePath());
		
		//System.out.println(file1.getPath());		//��ȡ���췽���д����·��
		//System.out.println(file2.getPath());
		
		//System.out.println(file1.getName());		//��ȡ�ļ������ļ��е�����
		//System.out.println(file2.getName());
		
		//System.out.println(file1.length());			//��ȡ����:�ֽ���
		
		System.out.println(file1.lastModified());		//��ȡ���һ���޸�ʱ��,����ֵ
		Date d = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}
