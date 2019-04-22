package com.qiao.regex;

public class Test7_Regex {

	/**
	 * A:������ʽ�ķ��鹦��
	 * 		���������ͨ�������Ҽ����俪���������.����,�ڱ��ʽ((A)(B(C)))��,�����ĸ���������
	 * 
	 * 		1		((A)(B(C)))
	 * 		2		(A
	 * 		3		(B(C))
	 * 		4		(C)
	 * 
	 * 		����ʼ�մ����������ʽ.
	 * B:����
	 * 		a:�и�
	 * 			����:�밴�յ����и�:"adqqfgkkkhjppppkl";
	 * 		b:�滻
	 * 			����:����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
	 * 			���ַ�����ԭ��:"��Ҫѧ���".
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		demo3();
		//demo4();
	}

	private static void demo4() {
		//����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��,
		String s1 = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String s2 = s1.replaceAll("\\.+","");//�ÿմ��滻�ַ������"."
		String s3 = s2.replaceAll("(.)\\1+","$1");//$1�����һ���е�����
		System.out.println(s3);
	}

	private static void demo3() {
		//���յ����и�:"adqqfgkkkhjppppkl";
		String s = "adqqfgkkkhjppppkl";
		String regex = "(.)\\1+";//+�����һ�����һ�λ���
		String[] arr = s.split(regex);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void demo2() {
		//���ʸ��˸���,��������
		String regex2 = "(..)\\1";
		System.out.println("��������".matches(regex2));//true
		System.out.println("���˸���".matches(regex2));//true
		System.out.println("�������".matches(regex2));//false
	}

	private static void demo1() {
		//���ʿ������,�߸�����
		String regex1 = "(.)\\1(.)\\2";//\\1�����һ���ֳ���һ��,\\2����ڶ����ֳ���һ��
		System.out.println("�������".matches(regex1));	//true
		System.out.println("��������".matches(regex1));	//false
		System.out.println("�߸�����".matches(regex1));	//true
		System.out.println("��������".matches(regex1));	//false
	}

}
