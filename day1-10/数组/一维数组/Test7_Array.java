//������(���ݼ���¼������,���Ҷ�Ӧ����)
import java.util.Scanner;
class Test7_Array {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������1-7֮�������:");
		int week = sc.nextInt();
		System.out.println("����" + getWeek(week));
	}

	/*
	�����������ض�Ӧ������
		1.����ֵ����char
		2.�����б�int week
	*/
	public static char getWeek (int week) {
		char [ ] arr = {' ','һ','��','��','��','��','��','��'};
		return arr [ week ];
	}
}