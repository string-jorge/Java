/*
��������������
	���ݼ���¼�������������,�ڿ���̨�������
���÷���
	��������
	�������(����)
	��ֵ����(����)
*/
import java.util.Scanner;
class Test4_Method {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);		//�����Ӽ���¼�����
		System.out.print("����������:");
		int row = sc.nextInt();			//����¼������浽row��
		System.out.print("����������:");
		int column = sc.nextInt();			//����¼������浽column��
		printStar(row,column);			//��������
		//System.out.println(printStar(row,column));	//�������(����):�˴�������ʹ��'��'����,����ֵ��void�ķ��������������
		//void v = printStar(row,column);		//��ֵ����(����)
	}
/*
�ڿ���̨�����������
	1.��ȷ����ֵ����,������û�о��巵��ֵ����,��void����
	2.��ȷ�����б�int x,int y
*/
	public static void printStar(int x,int y) {
		for(int a = 1;a <= x;a++) {			//����
			for(int b = 1;b <= y;b++) {		//����
			System.out.print("*");
			}
		System.out.println();
		}
	return ;						//�������ֵ������void,return����ʡ��,��ʹʡ��ϵͳҲ��Ĭ�ϸ�����,��ʽ��return;
	}
}