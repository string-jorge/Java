package com.qiao.test;

public class Test7 {

	/**
	 * ����:ͳ�ƴ���С�����ֵĴ���
	 * �����С�������Լ������������
	 * 
	 * ����:
	 * 1.�������������,����Ϊ0;
	 * 2.ͨ��indexOf�����ڴ�����С��,
	 * 		���û�з���-1,�������
	 * 		����з�������ֵ
	 * 3.���ݻ�ȡ������ֵ����С������,��ȡ��,����ȡ��Ľ����ֵ����
	 * 4.�ص��ڶ���
	 * 
	 */
	public static void main(String[] args) {
		//�����
		String max = "woaiheima,heimabutongyubaima,wulunbaimahaishiheima,zhaodaogongzuojiushihaoma";
		//����С��
		String min = "heima";
		
		//�������������
		int count = 0;
		//��������
		int index = 0;
		//����ѭ��
		while ((index = max.indexOf(min)) != -1) {
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}

}
