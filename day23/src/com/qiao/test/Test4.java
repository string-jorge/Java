package com.qiao.test;

import java.io.File;

public class Test4 {
	/*
	 * �Ӽ��̽���һ���ļ���·��,���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ,����:
	 * ���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ
	 * 
	 * ����:
	 * 1.��ȡ���е��ļ����ļ���,����File����
	 * 2.����
	 * 3.�������ļ������ļ���,����Ҫֱ�Ӵ�ӡ
	 * 4.������ļ���,�͵ݹ����
	 */
	public static void main(String[] args) {
		File dir = Test1.getDir();
		printFile(dir,0);
	}
	public static void printFile(File dir,int lev) {
		//��ȡ���е��ļ����ļ���,����File����
		File[] subFiles = dir.listFiles();
		//����
		for (File subFile : subFiles) {
			for (int i = 0; i <= lev; i++) {
				System.out.print("\t");
			}
			//�������ļ������ļ���,����Ҫֱ�Ӵ�ӡ
			System.out.println(subFile);
			//������ļ���,�͵ݹ����
			if(subFile.isDirectory()) {
				printFile(subFile,lev + 1);
			}
		}
	}
}
