//����������������,�Ƚ��������Ƿ����
import java.util.Scanner;
class Test3_Method {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.print("�������һ������:");
		int x = sc.nextInt();
		System.out.print("������ڶ�������:");
		int y = sc.nextInt();
		boolean i = isEquals(x,y);
		System.out.print(i);
	}
/*
�����������е����ֵ
	1.��ȷ����ֵ����	boolean
	2.��ȷ�����б�	int a,int b
*/
	public static boolean isEquals (int a,int b) {	//isEquals �Ƿ����
		return a == b;
	}
}