/*
1.������
	�̳й�ϵ,ֻ�ܵ��̳�,���Զ��̳�
2.����ӿ�
	ʵ�ֹ�ϵ,���Ե�ʵ��,Ҳ���Զ�ʵ��
	���һ������ڼ̳�һ�����ͬʱʵ�ֽӿ�
3.�ӿ���ӿ�
�̳й�ϵ,���Ե��̳�,Ҳ���Զ�̳�
*/
class Test2_Interface 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

interface InterA													//�ӿ�A
{
	public abstract void printA();
}

interface InterB													//�ӿ�B
{
	public abstract void printB();
}

interface InterC extends InterA,InterB								//�ӿ���ӿ��Ǽ̳�,�̳нӿ�A,�ӿ�B
{
}

class Demo implements InterA,InterB									//����ӿ���ʵ��,ʵ�ֽӿ�A,�ӿ�B
{
	public void printA() {
		System.out.println("PrintA");
	}

	public void printB() {
		System.out.println("PrintB");
	}
}