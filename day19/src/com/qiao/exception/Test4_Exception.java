package com.qiao.exception;

import java.io.FileInputStream;

public class Test4_Exception {

	/**
	 * ����ʱ�쳣
	 * 		Java���������ʾ����,�������ͻᷢ������,�޷�ͨ������
	 * ����ʱ�쳣
	 * 		������ʾ����,Ҳ���Ժͱ���ʱ�쳣һ������
	 * ������ʾ
	 * 		�������쳣���������쳣������
	 * 
	 * ����ʱ�쳣Ҳ��δ������쳣(�Զ���)
	 * 		δ�����:����ĳЩ�����ʱ��Ҫ��ĳЩ׼��
	 * 
	 * 		����ʱ�쳣:�ڱ���ĳ�������ʱ��,�п��ܻ����������������鷢��,�����Ҳ����ļ�,�������쳣�ͱ����ڱ����ʱ����
	 * ������������ͨ����
	 * 
	 * 		����ʱ�쳣:���ǳ���Ա�����Ĵ���,��Ҫ�����޸Ĵ���
	 */
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("xxx.txt");
		} catch(Exception e) {
			
		}
	}

}
