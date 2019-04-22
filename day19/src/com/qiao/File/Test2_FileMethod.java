package com.qiao.File;

import java.io.File;
import java.io.IOException;

public class Test2_FileMethod {

	/**
	 * A:��������
	 * 		public boolean createNewFile();:�����ļ�,��������������ļ�,�Ͳ�������
	 * 		public boolean mkdir();:�����ļ���,��������������ļ���,�Ͳ�������
	 * 		public boolean mkdirs();:�����ļ���,������ļ��в�����,����㴴������
	 * B:ע������:
	 * ����㴴���ļ������ļ�������д�̷�·��,��ô,Ĭ������Ŀ·����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("bbb.txt");			//����д�ǿ��Ե�,�ļ���Ҳ�����к�׺��
		System.out.println(dir2.mkdir());
		
		File dir3 = new File("ccc\\ddd");
		System.out.println(dir3.mkdirs());			//�����༶�ļ���/Ŀ¼
	}

	private static void demo1() throws IOException {
		File file1 = new File("yyy.txt");
		System.out.println(file1.createNewFile());//���û�оʹ���,����true,����оͲ�����,����false
		
		File file2 = new File("zzz");
		System.out.println(file2.createNewFile());
	}

}
