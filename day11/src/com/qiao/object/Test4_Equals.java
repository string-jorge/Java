package com.qiao.object;

import com.qiao.one.Student;

public class Test4_Equals {

	/**
	 * @param args
	 *            equals�������Ƚ����������Ƿ���� public boolean equals(Object obj) { return
	 *            (this == obj); } Object�е�equals�����ǱȽ϶���ĵ�ֵַ�ģ�û��ʲô���壬������Ҫ��д��
	 *            ��Ϊ�ڿ���������ͨ���Ƚϵ��Ƕ����е�����ֵ��������Ϊ��ͬ������ͬһ�������������Ǿ���Ҫ��дequals����
	 *            ==��equals�ŵ�����
	 *            	��ͬ�㣺���������Ƚ�
	 *            	��    ��1.==���ǱȽ���������ȿ��ԱȽϻ����������ͣ�Ҳ���ԱȽ������������ͣ������������ͱȽϵ���ֵ�������������ͱȽϵ��ǵ�ֵַ
	 *            		  2.equals����ֻ�ܱȽϵ��������������ͣ�equals������û��д֮ǰ���Ƚϵ��ǵ�ֵַ���ײ���������==�ţ����ǱȽϵ�ֵַ��û������ģ�������Ҫ��дequals�����Ƚ϶����е�����ֵ
	 */
	public static void main(String[] args) {
		Student s1 = new Student("����", 23);
		Student s2 = new Student("����", 23);
		boolean b = s1.equals(s2);// �Ƚ����������Ƿ����
		System.out.println(s1 == s2);
		System.out.println(b);//��д֮��Ƚϵ��Ƕ����е�����ֵ
	}
}
