//����������������,�����������е����ֵ
import java.util.Scanner;
class Test2_Method {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.print("�������һ������:");
		int x = sc.nextInt();
		System.out.print("������ڶ�������:");
		int y = sc.nextInt();
		int max = getMax(x,y);	//���÷���
		System.out.println("max = " + max);
	}
/*
�����������е����ֵ
	1.��ȷ����ֵ����	int
	2.��ȷ�����б�	int a,int b
*/
	public static int getMax (int a,int b) {
		return a > b ? a : b;
	}
}