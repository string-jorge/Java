import java.util.Scanner;
class Game_GuessNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);										//创建键盘录入,录入您猜的数
		System.out.print("请输入一个1-100之间的整数:");
		int guessNum = (int)(Math.random() * 100) + 1;									//心里想的一个数
		for( ; ; ){													//因为要猜很多次,所以用无限循环
			int result = sc.nextInt();										//您猜的数
			if(result > guessNum) {
				System.out.println("不好意思,您猜大了!请再猜一次:");
			}else if(result < guessNum) {
				System.out.println("不好意思,您猜小了!请再猜一次:");
			}else {
				System.out.println("恭喜您,猜中了!");
				break;
			}
		}
	}
}
