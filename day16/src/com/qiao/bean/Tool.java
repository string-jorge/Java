package com.qiao.bean;

public class Tool<T> {
	private T t;

	public T getObj() {
		return t;
	}

	public void setObj(T t) {
		this.t = t;
	}
	
	public<Q> void show(Q q) {//���������������ķ���һ��,�����һ��,��Ҫ�ڷ����������ķ���
		System.out.println(t);
	}
	
	public static<W> void print(W w) {//��̬�������������Լ��ķ���,��̬����������ļ��ض�����
		System.out.println(w);
	}
}
