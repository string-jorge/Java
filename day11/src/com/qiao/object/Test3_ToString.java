package com.qiao.object;

import com.qiao.one.Student;

public class Test3_ToString {

	/**
	 * @param args
	 * com.qiao.one.Student@1963006a
	 * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    ���:����
    �м�:@
    �ұ�:hashCode��ʮ�����Ʊ�����ʽ
    ��ôû��ʲô����
    toString����������:���Ը��������ʾ����ֵ
    getXxx������Ϊ�˻�ȡֵ,������ʾҲ���Ը�ֵ,��������������
	 */
	public static void main(String[] args) {
		Student s = new Student("����",23);
//		String str = s.toString();
//		System.out.println(str);
		System.out.println(s.toString());
		System.out.println(s);//���ֱ�Ӵ�ӡ��������,��Ĭ�ϵ���toString����
		
		System.out.println("�ҵ�������:" + s.getName() + ",�ҵ�������:" + s.getAge());
	}

}
