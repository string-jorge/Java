package com.qiao.chario;

public class Test8_Digui {

	/**
	 * 递归求5!
	 * 
	 * 递归的弊端:不能调用次数过多,容易导致栈内存溢出
	 * 递归的好处:不用知道循环的次数
	 * 
	 * 构造方法是否可以递归调用?
	 * 构造方法不能使用递归调用
	 * 
	 * 递归调用是否必须有返回值
	 * 不一定(可以有也可以没有)
	 */
	public static void main(String[] args) {
		/*int result = 1;
		for(int i = 1;i < 6;i++) {
			result *= i;
		}
		System.out.println(result);*/
		System.out.println(fun(5));
		}
	public static int fun(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * fun(num - 1);
		}
	}	

}
