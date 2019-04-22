class Test_Return {
	public static void main(String[] args) {
		for(int x = 1;x <= 10;x++) {
			if(x == 4) {
			//break;		//break结束循环
			return;                     //return返回的意思,用来返回方法
			}
		}
		System.out.println("循环结束!");
	}
}