class Test3_Final 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.print();
	}
}
/*
final���α����ĳ�ʼ��ʱ��
	��ʾ��ʼ��
	�ڶ��������ǰ����
*/

class Test {
	final int NUM;						//��Ա������Ĭ�ϳ�ʼ��ֵ����Ч��

	public Test() {
		NUM = 10;
	}

	public void print() {
		System.out.println(NUM);
	}
}