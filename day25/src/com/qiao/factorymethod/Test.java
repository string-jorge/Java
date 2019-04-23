package com.qiao.factorymethod;

public class Test {

	/**
	 * @param args
	 * A:��������ģʽ����
	 * 		��������ģʽ�г��󹤳��ฺ�𴴽�����Ľӿ�,�������Ĵ���������ʵ�ֳ��󹤳��ľ�������ʵ��
	 * B:�ŵ�
	 * 		�ͻ��˲���Ҫ�ڸ������Ĵ���,�Ӷ���ȷ�˸������ְ��,������µĶ�������,ֻ��Ҫ����һ���������;���Ĺ����༴��,��Ӱ�����еĴ���,����ά������,��ǿ��ϵͳ����չ��
	 * C:ȱ��
	 * 		��Ҫ����ı�д����,�����˹�����
	 */
	public static void main(String[] args) {
		DogFactory df = new DogFactory();
		Dog d = (Dog) df.createAnimal();
		d.eat();
		
		CatFactory cf = new CatFactory();
		Cat c = (Cat) cf.createAnimal();
		c.eat();
	}

}
