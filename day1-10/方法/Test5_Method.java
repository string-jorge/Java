//���ݼ���¼����������Ӧ�ĳ˷���
import java.util.Scanner;
class Test5_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��1-9֮�����:");
		int num = sc.nextInt();
		print99(num);
	}

	public static void print99 (int a) {
		for (int x = 1;x <= a;x++) {
			for (int y = 1;y <= x;y++) {
				System.out.print(y + "*" + x + "=" + (x * y) + "\t");
			}
		System.out.println();
		}
	}
}