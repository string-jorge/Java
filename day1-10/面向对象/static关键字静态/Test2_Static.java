class  Test2_Static
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();					//��������
		d.print1();								//�Ǿ�̬����

		Demo.print2();							//��̬����(����.��̬��Ա������)
	}
}

class Demo
{
	int num1 = 10;								//�Ǿ�̬�ĳ�Ա����
	static int num2 = 20;						//��̬�ĳ�Ա����

	public void print1() {						//�Ǿ�̬�ĳ�Ա����,�����Է��ʾ�̬�ĳ�Ա����Ҳ���Է��ʷǾ�̬�ĳ�Ա����
		System.out.println(num1);
		System.out.println(num2);
	}

	public static void print2() {				//��̬�ĳ�Ա����
		//System.out.println(this.num1);		//���ܷ��ʷǾ�̬�ĳ�Ա,����: �޷��Ӿ�̬�����������÷Ǿ�̬����num1;������this.,this���ж������ֵ
		System.out.println(num2);
	}
}
