package com.qiao.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	/**
	 * �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ��
	 * 
	 * 1.���巽���Լ���¼���·�������ж�,������ļ��ͷ���
	 * 2.���������н��ո��ļ�
	 * 3.����д���ļ�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = getFile();			//��ȡFile(�ļ�)����
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ�:");
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()) {								//�ж��Ƿ���Ŀ¼
				System.out.println("������Ĳ����ļ�,������¼��:");
			} else if (file.isDirectory()) {					//�ж��Ƿ����ļ���
				System.out.println("���������һ���ļ���,������¼��:");
			} else {
				return file;
			}
		}
	}
}
