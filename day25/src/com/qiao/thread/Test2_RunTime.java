package com.qiao.thread;

import java.io.IOException;

public class Test2_RunTime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();		//��ȡ����ʱ����
		//r.exec("shutdown -s -t 300");			//�ٵ����Ľ�����ִ��ָ�����ַ�������,300���ע���û�
		r.exec("shutdown -a");					//ȡ��ע��
	}

}
