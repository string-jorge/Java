package com.qiao.generic;

public class Test4_Generic {

	/**
	 * A:���ͽӿڵĸ���
	 * 		�ѷ��Ͷ����ڽӿ���
	 * B:�����ʽ
	 * 		public interface �ӿ���<��������>
	 * C:���ͽӿڵ�ʹ��
	 */
	public static void main(String[] args) {
		
	}
}

interface Inter<T> {
	public void show(T t);
}
/*//��һ��ʵ�ַ��ͽӿ�(�Ƽ�)
class Test implements Inter<String> {

	@Override
	public void show(String t) {
		System.out.println(t);
	}
}*/
//�ڶ���ʵ�ַ��ͽӿ�,û�б�Ҫ��ʵ�ֽӿڵ�ʱ����Լ��ӷ���
class Test<T> implements Inter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}
}