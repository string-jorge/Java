class Test1_Final 
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.print();
	}
}
/*
1.final ���յ���˼
2.�����ص�
	������,�಻�ܱ��̳�
	���α���,�����ͱ���˳���,ֻ�ܱ���ֵһ��
	���η���,�������ܱ���д
*/
/*final class Father {
	public void print() {
		System.out.println("���ʵײ�������Դ");
	}
}*/

class Son /*extends Father*/ {

	final int NUM = 10;					//�����������淶,�����һ������������ĸ����д,����Ƕ������,������ĸ����д,���»��߷ֿ�
	//public static final double PI = 3.14;			//final���α����г���,һ�����public static����
	public void print() {
		System.out.println(NUM);
	}
}