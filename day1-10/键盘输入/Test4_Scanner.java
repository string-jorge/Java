import java.util.Scanner;
public class Test4_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int x = sc.nextInt();
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();
		System.out.println("���������������:");
		int z = sc.nextInt();
		int temp = (x > y)? x : y;
		int max = (temp > z)? temp : z;
		System.out.println("max =" + max);
	}
}