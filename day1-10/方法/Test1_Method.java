/*
����:����������͵ķ���
	1.�����ĺͻ�������
	2.������δ֪���ݲ�������
���д����
	1.��ȷ����ֵ����      int
	2.��ȷ�����б�         ������int��
*/
public class Test1_Method {
	public static void main(String[] args) {
		int x = add (10,50);		//(�Ƽ���)���÷���;add�ǵ��õķ���10,50����ʵ�ʲ���
		//add(10,50);	�з���ֵ�ĵ�������,û������
		//System.out.println(add(10,50));	���������ǿ��Ե�,but�����Ҫ��������,���Ƽ���������
			System.out.println(x);
	}

	public static int add (int a,int b){            //public static ���������η�;int����������int���͵���;add������(�����������򼴿�);int a,int b��������ʽ�������ڽ���ʵ�ʲ���
		int sum = a + b;
		return sum;		//����з���ֵ,������return����
	}
}