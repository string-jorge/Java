package com.qiao.stringbuffer;

public class Test3_StringBuffer {

	/**
	 * StringBuffer��ɾ������
	 * 		public StringBuffer deleteCharAt(int index):
	 * 			ɾ��ָ��λ�õ��ַ�,�����ر���
	 * 		public StringBuffer delete(int start,int end):
	 * 			ɾ����ָ��λ�ÿ�ʼָ��λ�ý���������,�����ر���
	 */
	public static void main(String[] args) {
		//StringBuffer��ɾ������
		//ɾ��ָ��λ�õ��ַ�
		StringBuffer sb1 = new StringBuffer("shiqqiao");
		//sb1.deleteCharAt(10);//�������������������û��Ԫ�ص�ʱ��ͻᱨStringIndexOutOfBoundsException
		sb1.deleteCharAt(3);//ɾ��3������Ӧ���ַ�(�����ַ�)
		System.out.println(sb1);//"shiqiao"
		
		//ɾ����ָ��λ�ÿ�ʼָ��λ�ý���������
		StringBuffer sb2 = new StringBuffer("shiqiaoqiao");
		sb2.delete(3, 7);//ɾ����3������ʼ��7�����������ַ�("qiao"),����ͷ������β
		System.out.println(sb2);//"shiqiao"
		
		//��ջ�����
		StringBuffer sb3 = new StringBuffer("shiqiao");
		sb3.delete(0,sb3.length());// ,������β,���Բ���(sb3.length() - 1)
		
		/*sb1 = new StringBuffer();//��Ҫ�����ַ�ʽ��ջ�����,ԭ���Ļ�������������,�˷��ڴ�
		System.out.println(sb1);*/
	}

}
