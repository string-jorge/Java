package com.qiao.stringbuffer;

public class Test4_StringBufferMethod {

	/**
	 * A:StringBuffer的替换功能
	 * 		public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
	 * B:StringBuffer的反转功能
	 * 		public StringBuffer reverse():字符串反转
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("shiqiao");
		sb1.replace(0, 3, "li");//用"li"替换"shi"
		System.out.println(sb1);//"liqiao"
		
		sb1.reverse();//反转
		System.out.println(sb1);
	}

}
