/*
重载:方法名相同,参数列表不同,与返回值类型无关
	分类：
		1.参数个数不同
		2.参数类型不同
		3.顺序不同（int a，double b）和（double a，int b）
*/
class Test6_Overload {			//overload重载
	public static void main(String[] args) {
		double sum1 = add (50,60);
		System.out.println(sum1);

		int sum2 = add (50,60,70);
		System.out.println(sum2);

		double sum3 = add (12.3,13.4);
		System.out.println(sum3);
	}

	public static double add (int a,int b) {	//两个数的和，int类型
		return a + b;
	}

	public static int add (int a,int b,int c) {	//三个数的和double类型
		return a + b + c;
	}

	public static double add (double a,double b) {	//两个数的和double类型
		return a + b;
	}
}