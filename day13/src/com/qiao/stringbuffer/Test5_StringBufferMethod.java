package com.qiao.stringbuffer;

public class Test5_StringBufferMethod {

	/**
	 * A:StringBuffer�Ľ�ȡ����
	 * 		public String substring(int start):
	 * 			��ָ��λ�ý�ȡ��ĩβ.
	 * 		public String substring(int start,int end):
	 * 			��ȡ��ָ��λ�ÿ�ʼ��ָ��λ�ý���,������ʼλ��,����������λ��(����ͷ������β)
	 * B:ע������
	 * 		ע��:����ֵ���Ͳ�����StringBuffer����
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("woaishiqiao");
		String str1 = sb1.substring(4);//��ȡ��4������ʼ��ĩβ,���ı�ԭ����StringBuffer
		System.out.println(str1);//"shiqiao"
		
		System.out.println(sb1);//"woaishiqiao",ԭ����û�б��ı�
		
		String str2 = sb1.substring(4,7);//��ȡ��4������ʼ��7��������,������7
		System.out.println(str2);//"shi"
	}

}
