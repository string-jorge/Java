import java.util.Scanner;
class Game_GuessNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);										//��������¼��,¼�����µ���
		System.out.print("������һ��1-100֮�������:");
		int guessNum = (int)(Math.random() * 100) + 1;									//�������һ����
		for( ; ; ){													//��ΪҪ�ºܶ��,����������ѭ��
			int result = sc.nextInt();										//���µ���
			if(result > guessNum) {
				System.out.println("������˼,���´���!���ٲ�һ��:");
			}else if(result < guessNum) {
				System.out.println("������˼,����С��!���ٲ�һ��:");
			}else {
				System.out.println("��ϲ��,������!");
				break;
			}
		}
	}
}
