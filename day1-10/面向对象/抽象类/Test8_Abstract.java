class Test8_Abstract 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
1.�������п���û�г��󷽷�,��ô���ǲ��������ഴ���������,�����������
2.abstract���ܺ�static,private,final����
	A:abstract��static
		��abstract���εķ���û�з�����
		��static���εĵĿ�����(����.)����,����(����.)���ó��󷽷���û�������
	B:abstract��final
		��abstract���εķ���ǿ��������д
		��final���εĲ���������д,����������ì�ܵ�
	C.abstract��private
		��abstract���ε���Ϊ�������࿴����ǿ����д
		��private���β����������,����������ì�ܵ�
*/
abstract class Demo
{
	//public static abstract void print();		//����: �Ƿ������η����: abstract��static
	//public final abstract void print();		//����: �Ƿ������η����: abstract��final
	//private abstract void print();			//����: �Ƿ������η����: abstract��private
}