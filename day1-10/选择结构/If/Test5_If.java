import java.util.Scanner;
public class Test5_If {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("�������һ����:");
	int a = sc.nextInt();
	System.out.print("������ڶ�����:");
	int b = sc.nextInt();
	System.out.print("�������������:");
	int c = sc.nextInt();
		if (a > b) {
			if (a > c) {
			System.out.print(a + "�����ֵ");
			} else { 
			System.out.print(c + "�����ֵ");
			}
		} else {
			if (b > c) {
				System.out.print(b + "�����ֵ");
			} else {
				System.out.print(c + "�����ֵ");
			}
		}

	}
}