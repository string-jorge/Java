package com.qiao.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.qiao.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Test2_Collecttion {

	/**
	 * A:����������ʾ
	 * 
	 * boolean add(E e):���Ԫ��(����)���������������Ķ���
	 * boolean remove(Object o):ɾ��ָ��Ԫ��
	 * void clear():��ռ���
	 * boolean contains(Object o):�ж��Ƿ����
	 * boolean isEmpty():�жϼ����Ƿ�Ϊ��
	 * int size():��ȡ������Ԫ�صĸ���
	 * 
	 * B:ע��:
	 * collectionXxx.javaʹ����δ�����򲻰�ȫ�Ĳ���
	 * ע��:Ҫ�˽���ϸ��Ϣ,��ʹ��-Xlint:unchecked���±��롣
	 * Java��������Ϊ�ó�����ڰ�ȫ������
	 * 
	 * add���������List����һֱ������true����ΪList�������ǿ��Դ����ظ�Ԫ�ص�
	 * �����set���ϵ��洢�ظ�Ԫ�ص�ʱ�򣬾ͻ᷵��false
	 */
	public static void main(String[] args) {
		demo1();
		//demo2();
		}

	private static void demo2() {
		//ɾ��ָ��Ԫ��
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//c.remove("b");//ɾ��ָ��Ԫ��
		//System.out.println(c);//[a, c, d]*/	
		
		/*c.clear();//��ռ���
		System.out.println(c);//[]*/
		
		//System.out.println(c.contains("b"));//�жϼ���c�Ƿ����"b"Ԫ��
		
		//System.out.println(c.isEmpty());//�жϼ����Ƿ�Ϊ��
		
		System.out.println(c.size());//4,��ȡ������Ԫ�صĸ���
	}

	private static void demo1() {
		//���Ԫ��
		Collection c = new ArrayList();//��������ָ���������
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);//�Զ�װ��new Boolean(true);
		boolean b3 = c.add(100);//�Զ�װ��new Integer(100);
		boolean b4 = c.add(new Student("����",23));
		boolean b5 = c.add("abc");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println(c);//[abc, true, 100, Student [name=����, age=23], abc]
	}

}
