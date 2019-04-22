class Test2_InnerClass 
{
	public static void main(String[] args) 
	{
		//Outer.Inner oi = new Outer().new Inner();						//class Inner ��˽����,�������ܷ�����
		Outer o = new Outer();
		o.print();
	}
}
class Outer
{
	private int num = 10;
	private class Inner													//�ڲ���˽��
	{
		public void method() {
			System.out.print(num);
		}
	}
	public void print() {
		Inner i = new Inner();											//�����ڲ������
		i.method();														//�����ڲ���method����
	}
}
