package com.qiao.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	/**
	 * ����������һ�����ð����,û�й��������ʱ��,ÿִ��һ�ξͻ��������ǻ��ж��ٴ�ʹ�û���,��ѧ����IO��֪ʶ,ģ����԰����,
	 * ����ʮ�λ���,ִ��һ�ξ�����һ�λ��м��λ���,�������������ʾ�����빺������
	 * 
	 * ����:
	 * 1.������������������������,��ΪҪʹ��readLine����,���Ա�֤���ݵ�ԭ����
	 * 2.���������ַ���ת��Ϊint��
	 * 3.��int�������ж�,�������0,�ͽ������д��ȥ,���������0,����ʾ��������
	 * 4.��if�ж���Ҫ�������Ľ����ӡ,�������ͨ�������д���ļ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1.������������������������,��ΪҪʹ��readLine����,���Ա�֤���ݵ�ԭ����
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		//2.���������ַ���ת��Ϊint��
		String line = br.readLine();
		int times = Integer.parseInt(line);
		//3.��int�������ж�,�������0,�ͽ������д��ȥ,���������0,����ʾ��������
		if(times > 0) {
			System.out.println("������" + times-- + "�λ���");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(times + "");
			fw.close();
		} else {
			System.out.println("����ʹ�ô���������,�빺������");
		}
		br.close();
	}

}
