package com.qiao.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	/**
	 * @param args
	 * �Ӽ��̽��������ļ���·��,�����е�һ���ļ�����(��������)����������һ���ļ�����
	 * 
	 * ������һ���ļ�����(��������)����������һ���ļ�����
	 * ����
	 * 1.��Ŀ���ļ����д���ԭ�ļ�
	 * 2.��ȡԭ�ļ��������е��ļ����ļ���,�洢��File������
	 * 3.��������
	 * 4.������ļ�����IO����д
	 * 5.������ļ��о͵ݹ����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File src = Test1.getDir();
		File dest = Test1.getDir();
		copy(src,dest);
	}

	public static void copy(File src, File dest) throws IOException {
		//��Ŀ���ļ����д���ԭ�ļ�
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		//��ȡԭ�ļ��������е��ļ����ļ���,�洢��File������
		File[] subFiles = src.listFiles();
		//��������
		for (File subFile : subFiles) {
			//������ļ�����IO����д
			if(subFile.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newDir, subFile.getName())));
				
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			//������ļ��о͵ݹ����
			} else {
				copy(subFile,newDir);
			}
		}
	}
}
