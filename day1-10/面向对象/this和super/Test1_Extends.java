class Test1_Extends
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.print();
	}
}

class Father {
	int num1 = 10;
	int num2 = 30;
}

class Son extends Father {
	int num2 = 20;

	public void print() {
	System.out.println(this.num1);					//10,this�����Ե�������ĵ�Ҳ���Ե��ø����(����û�е������)/�̳��������õ�
	System.out.println(this.num2);					//20,�ͽ�ԭ��,�����оͲ��ø������
	System.out.println(super.num2);					//30
	}
}