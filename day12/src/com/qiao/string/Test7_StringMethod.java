package com.qiao.string;

public class Test7_StringMethod {

	/**
	 * A:String���滻����
	 * 		String replace(char old,char new)
	 * 		String replace(String old,String new)
	 * B:String��ȥ���ַ������˵Ŀո�
	 * 		String trim()
	 * C:String�İ����ֵ�˳��Ƚ������ַ���
	 * 		int compareTo(String str)
	 * 		int compareToIgnoreCase(String str)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		demo3();
	}

	private static void demo3() {
		//String�İ����ֵ�˳��Ƚ������ַ���
		
		//���ִ�Сд
		String s1 = "abc";
		String s2 = "def";
		int num1 = s1.compareTo(s2);//-3,�������ֵ�Ƚ�
		System.out.println(num1);
		
		String s3 = "ʯ";
		String s4 = "��";
		int num2 = s3.compareTo(s4);//10655,���ҵ���unicode���ֵ
		System.out.println('ʯ' + 0);//30707
		System.out.println('��' + 0);//20052
		System.out.println(num2);
		
		//�����ִ�Сд
		
		//�Ƚ�:
		//���ִ�Сд
		String s5 = "shiqiao";
		String s6 = "SHIQIAO";
		int num3 = s5.compareTo(s6);//32
		System.out.println(num3);
		
		//�����ִ�Сд
		int num4 = s5.compareToIgnoreCase(s6);//0,���
		System.out.println(num4);
		/*
		 * compareToIgnoreCase�ײ�ʵ�ֵķ���
		 * public int compare(String s1, String s2) {
            int n1 = s1.length();//��ȡs1�ĳ���
            int n2 = s2.length();//��ȡs2�ĳ���
            int min = Math.min(n1, n2);//�õ����Ƚ�С��
            for (int i = 0; i < min; i++) {//�������Ƚ�С�ĵ��ַ���
                char c1 = s1.charAt(i);//��s1�����ȡ��һ���ַ�
                char c2 = s2.charAt(i);//��s2�����ȡ��һ���ַ�
                if (c1 != c2) {//������һ���ַ��������
                    c1 = Character.toUpperCase(c1);//��c1�ַ�ת���ɴ�д
                    c2 = Character.toUpperCase(c2);//��c2�ַ�ת���ɴ�д
                    if (c1 != c2) {//����������
                        c1 = Character.toLowerCase(c1);//��c1�ַ�ת����Сд
                        c2 = Character.toLowerCase(c2);//��c2�ַ�ת����Сд
                        if (c1 != c2) {//����������
                            // No overflow because of numeric promotion
                            return c1 - c2;�����Ҷ�Ӧ���ֵ����Ľ��
                        }
                    }
                }
            }
            return n1 - n2;//���û��forѭ��ֱ�ӷ��س�������Ľ��
        }
    }
		 */
	}

	private static void demo2() {
		//String��ȥ���ַ������˵Ŀո�
		String s1 = "   shi   qiao   ";
		String s2 = s1.trim();//ȥ�����˵Ŀո�
		System.out.println(s2);
	}

	private static void demo1() {
		//String���滻����
		String s1 = "shiqiao";
		//�滻�ַ�
		String s2 = s1.replace('i', 'e');//��'o'�滻'i'
		System.out.println(s2);
		
		String s3 = s1.replace('w', 'o');//'w'������,����ԭ�ַ�����
		System.out.println(s3);
		
		//�滻�ַ���
		String s4 = s1.replace("shi","li");//��"li"�滻"shi"
		System.out.println(s4);
		
		String s5 = s1.replace("zhang", "li");//"zhang"������,����ԭ�ַ�������
		System.out.println(s5);
	}

}
