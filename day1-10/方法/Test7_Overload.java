/*
比较两个数据是否相等,并在main方法中进行测试
	1.int类型
	2.double类型
*/
class Test7_Overload {
	public static void main (String[] args) {
		boolean b1 = isEquals(10,10);
		System.out.println(b1);

		boolean b2 = isEquals(10.5,10.5);
		System.out.println(b2);

	}

	public static boolean isEquals (int x,int y) {
		return x == y;
	}

	public static boolean isEquals (double x,double y) {
		return x == y;
	}

}