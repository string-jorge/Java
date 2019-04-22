package com.qiao.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 * ����¼��һ���ļ���·��,ͳ�Ƹ��ļ��д�С
	 */
	public static void main(String[] args) {
		File dir = getDir();
		System.out.println(getFileLength(dir));
	}
	//�Ӽ��̽���һ���ļ���·��
	public static File getDir() {
		///��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·��:");
		//����һ������ѭ��
		while(true) {
			////�����յ����ݴ洢����װ��File����
			String line = sc.nextLine();
			File dir = new File(line);
			//�жϸ��ļ���·���Ƿ����
			if(!dir.exists()) {
				System.out.println("��������ļ���·��������,����������:");
			//�ж��Ƿ����ļ�
			} else if(dir.isFile()) {
				System.out.println("���������һ���ļ�,����������:");
			} else {
				//���ļ���·�����󷵻�
				return dir;
			}
		}
	}
	//ͳ�Ƹ��ļ��д�С
	public static long getFileLength(File dir) {
		//������ͱ���
		long len = 0;
		//��ȡ���ļ����µ������ļ����ļ���listFiles();
		File[] subFiles = dir.listFiles();
		//��������
		for (File subFile : subFiles) {
			//�ж����ļ��ͼ����С���ۼ�
			if(subFile.isFile()) {
				len = len + subFile.length();
			//�ж����ļ��о͵ݹ����
			} else {
				len = len + getFileLength(subFile);
			}
		}
		return len;
	}
}
