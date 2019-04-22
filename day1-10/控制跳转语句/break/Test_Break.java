/*
break的使用场景:
	只能在switch和循环中使用
*/
class Test_Break {
	public static void main(String[] args) {
		for (int x = 1;x <= 10;x++){
			if (x == 5) {
				break;                            //跳出循环
			}
			System.out.println("x = " + x);
		}
	}
}