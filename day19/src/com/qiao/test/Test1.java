package com.qiao.test;

public class Test1 {

	/**
	 * ������1:
	 * 		final,finally��finalize������
	 * 		final������,�಻�ܱ��̳�
	 * 		final���η���,�������ܱ���д
	 * 		final���α���,����ֻ�ܸ�ֵһ��
	 * 
	 * 		finallyʱtry����е������,���ܵ���ʹ��,�����ͷ���Դ
	 * 
	 * 		finalize��һ������,������������ȷ�������ڶԸö���ĸ�������ʱ,�ɶ�����������������ô˷���.
	 * ������2:
	 * 		���catch������return���,����finally�Ĵ��뻹��ִ����?�����,��������returnǰ����return��.
	 */
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.method());
	}

}

class Test {
	public int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1 / 0);
			return x;
		} catch (Exception e) {
			x = 30;
			return x;
		} finally {
			x = 40;
			//return x;	//ǧ��Ҫ��finally����д�������,��Ϊfinally��������Ϊ���ͷ���Դ,�ǿ϶���ִ�е�
			//�����������д�������,��ôtry��catch�Ľ�����ᱻ�ı�,������ôд���Ƿ���
		}
	}
}