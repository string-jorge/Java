class Test2_Abstract 
{
	public static void main(String[] args) 
	{
		
	}
}

/*
1.������ĳ�Ա�ص�
	a.��Ա����:�ȿ����ǳ���,Ҳ�����Ǳ���;abstract���������γ�Ա����
	b.�й��췽��,����������ʸ������ݵĳ�ʼ��
	c.��Ա����:�ȿ����������Ҳ�����Ƿǳ����
2.�������Ա����������:
	a.���󷽷�:ǿ��Ҫ��������������
	b.�ǳ��󷽷�:����̳е�����,��ߴ���ĸ�����
*/

abstract class Demo
{
	int num1 = 10;								//����
	public static final int num2 = 20;			//����

	public Demo() {}							//���췽��

	public void print() {						//�ǳ��󷽷�(����̳е�����)
		System.out.println("print����");
	}

	public abstract void method();				//���󷽷�(ǿ��Ҫ��������������)
}

class Test extends Demo
{
	public void method(){						//��д������󷽷�(����Ҫ��������)
		System.out.println("method����");
	}
}