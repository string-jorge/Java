/*
�̳��й��췽���Ĺ�ϵ
	1.�����еĹ��췽��Ĭ�϶�����ʸ����еĿղεĹ��췽��
	2.�����̸����е�����,���ܻ���ʹ�ø����е�����
	3.�����ʼ��ǰ,һ��Ҫ����ɸ������ݵĳ�ʼ��
	4.һ�����췽���ĵ�һ�����Ĭ�϶���:super()
	5.Object����������
*/
class Test5_Extends 
{
	public static void main(String[] args) 
	{
		Son s = new Son();
	}
}

class Father extends Object
{
	public Father() {
		super();
		System.out.println("Father �Ĺ��췽��");
	}
}

class Son extends Father
{
	public Son() {
		super();									//����һ�����,�����д,ϵͳ��Ĭ�ϼ���,�������ʸ����еĿղι���
		System.out.println("Son �Ĺ��췽��");
	}
}
