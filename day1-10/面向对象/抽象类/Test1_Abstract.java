class Test1_Abstract 
{
	public static void main(String[] args) 
	{
		//Animal a = new Animal();					//Animal�ǳ����,�޷�ʵ����
		Animal a = new Cat();						//��������ָ���������
		a.eat();
	}
}
/*
�������ص�
	1.������ͳ��󷽷�������abstract�ؼ���������
		�������ʽ:abstract class ����(){}
		���󷽷���ʽ:public abstract void eat();
	2.�����಻һ���г��󷽷�,�г��󷽷�����һ���ǳ���������ǽӿ�
	3.�����಻��ʵ����,��ô���������ʵ����?
		���ն�̬�ķ�ʽ,�ɾ��������ʵ����;��ʵҲ�Ƕ�̬��һ��,�������̬
	4.�����������
		Ҫô�ǳ�����,Ҫô��д�������е����г��󷽷�
*/
abstract class Animal								//������
{
	public abstract void eat();						//���󷽷�
}

class Cat extends Animal
{
	public void eat() {
		System.out.println("è����");
	}
}
