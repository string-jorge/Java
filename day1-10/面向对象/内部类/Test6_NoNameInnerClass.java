//�����ڲ���(�ֲ��ڲ����һ��)
class Test6_NoNameInnerClass 
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		o.method();
	}
}

interface Inter
{
	public abstract void print();					//�ӿ��еĳ��󷽷�,����ʡ��public abstract
}

class Outer											//�ⲿ��
{
	class  Inner implements Inter					//�ڲ���ʵ����Inter�ӿ�
	{
		public void print() {						//��д�ӿ��еĳ��󷽷�
			System.out.println("print");
		}
	}
	public void method() {							//�����ⲿ���еķ���
		//Inner i = new Inner();					//��Ҫ�����ڲ����������
		//i.print();
		//new Inner.print();

//�����ڲ����൱�ڽӿڵ��������
		new Inter() {
			public void print() {					//��д�ӿ��еĳ��󷽷�
				System.out.println("print");
			}
		}.print();
	}
}