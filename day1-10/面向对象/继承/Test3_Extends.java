/*
�̳е�ע������
	1.����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
	2.���಻�ܼ̳и���Ĺ��췽��,������ͨ��super�ؼ���ȥ���ʸ��๹�췽��
*/
class Test3_Extends 
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.show();
	}
}

class Father {
	//private void show() {						//����˽������Ͳ��ܼ̳и���ĳ�Ա����
	//private String name;						//����˽�г�Ա������ԭ����������steXxx��setXxx����(���Լ̳�steXxx��setXxx����)
	public void show() {
		System.out.println("Hello World!");
	}
}

class Son extends Father{}