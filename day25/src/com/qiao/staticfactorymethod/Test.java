package com.qiao.staticfactorymethod;

public class Test {

	/**
	 * @param args
	 * A:�򵥹���ģʽ����
	 * 		�ֽо�̬��������ģʽ,������һ������Ĺ����ฺ�𴴽�һЩ���ʵ��
	 * B:�ŵ�
	 * 		�ͻ��˲���Ҫ�ڸ������Ĵ���,�Ӷ���ȷ�˸�����ְ��
	 * C:ȱ��
	 * 		�����̬�����ฺ�����ж���Ĵ���,������µĶ�������,����ĳЩ����Ĵ�����ʽ��ͬ,����Ҫ���ϵ��޸Ĺ�����,�����ں���ά��
	 */
	public static void main(String[] args) {
		//Dog d = AnimalFactory.CreateDog();
		
		Dog d = (Dog) AnimalFactory.createAnimal("dog");
		d.eat();
		
		Cat c = (Cat) AnimalFactory.createAnimal("cat");
		c.eat();
	}

}
