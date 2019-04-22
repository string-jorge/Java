package com.qiao.test;

import java.io.File;
import java.util.Scanner;

public class Test4 {

	/**
	 * �Ӽ����������һ���ļ���·��,��ӡ�����ļ��������е�.java�ļ���
	 * 
	 * ����:
	 * �Ӽ��̽���һ���ļ���·��
	 * 1.���¼����ǲ�����,�������ʾ
	 * 2.�����¼������ļ�·��,������ʾ
	 * 3.������ļ���·��,ֱ�ӷ���
	 * 
	 * ��ӡ�����ļ������е�.java�ļ���
	 * 1.��ȡ�����ļ���·���µ����е��ļ����ļ���,�洢��File������
	 * 2.��������,��ÿ���ļ������ļ������ж�
	 * 3.������ļ�,���Һ�׺��.java��,�ʹ�ӡ
	 * 4.������ļ���,�͵ݹ����
	 */
	public static void main(String[] args) {
		File dir = getDir();		//��ȡ���ļ���·��
		printJavaFile(dir);
	}
	//�Ӽ��̽���һ���ļ���·��,������ļ���·���ͷ���
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·��:");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("��������ļ��в�����,����������!");
			} else if(dir.isFile()){
				System.out.println("���������һ���ļ�,����������!");
			} else {
				return dir;
			}
		}
	}
	
	public static void	printJavaFile(File dir) {
		// 1.��ȡ�����ļ���·���µ����е��ļ����ļ���,�洢��File������
		File[] subFiles = dir.listFiles();
		// 2.��������,��ÿ���ļ������ļ������ж�
		for (File subFile : subFiles) {
			// 3.������ļ�,���Һ�׺��.java��,�ʹ�ӡ
			if(subFile.isFile() && subFile.getName().endsWith(".java")) {
				System.out.println(subFile);
			// 4.������ļ���,�͵ݹ����
			} else if(subFile.isDirectory()) {
				printJavaFile(subFile);
			}
		}
		
		
	}
}
