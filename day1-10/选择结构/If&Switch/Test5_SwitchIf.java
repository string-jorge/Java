import java.util.Scanner;
public class Test5_SwitchIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������·�:");
		int month = sc.nextInt();
		if (month > 12 || month < 1 ) {
			System.out.println("�Բ���û�ж�Ӧ����!");
		}else if (month >= 3 && month <= 5) {
			System.out.println(month + "���Ǵ���");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month + "�����ļ�");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month + "�����＾");
		}else {
			System.out.println(month + "���Ƕ���");
		}
	}
}