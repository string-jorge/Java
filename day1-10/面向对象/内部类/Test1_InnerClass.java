/*
A.�ڲ�������ص�
	1.�ڲ������ֱ�ӷ����ⲿ���Ա,����˽��
	2.�ⲿ��Ҫ�����ڲ���ĳ�Ա,���봴���ڲ������
*/
class Test1_InnerClass 
{
	public static void main(String[] args) 
	{
		//Inner i = new inner();										//����
		//��ʽ:�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������
		Outer.Inner oi = new Outer().new Inner();						//�����ڲ������
		oi.method();

		Outer o = new Outer();
		System.out.println(o.getY());
	}
}
class Outer
{
	private int x = 20;													//�ⲿ���Ա����

	class Inner {
		private int y = 10;												//�ڲ����Ա����

		public void method() {
			System.out.println(x);
		}
	}

	public int getY() {													//��ȡ�ڲ����ԱY
		return new Inner().y;
	}
}