import java.util.Scanner;
public class Test3_Scanner {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ������:");
	int x = sc.nextInt();
	System.out.println("������ڶ�������:");
	int y = sc.nextInt();
	boolean b = (x == y);
	System.out.println(b);
	}
}