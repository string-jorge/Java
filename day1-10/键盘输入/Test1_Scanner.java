import java.util.Scanner;
class Test1_Scanner {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int x = sc.nextInt();

		System.out.println("������ڶ�������:");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("�������ĺ�Ϊ:" + sum);
	}
}