//数组查表法(根据键盘录入索引,查找对应星期)
import java.util.Scanner;
class Test7_Array {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入1-7之间的整数:");
		int week = sc.nextInt();
		System.out.println("星期" + getWeek(week));
	}

	/*
	根据索引返回对应的星期
		1.返回值类型char
		2.参数列表int week
	*/
	public static char getWeek (int week) {
		char [ ] arr = {' ','一','二','三','四','五','六','日'};
		return arr [ week ];
	}
}