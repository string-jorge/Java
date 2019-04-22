package com.qiao.stringbuffer;

public class Test5_StringBufferMethod {

	/**
	 * A:StringBuffer的截取功能
	 * 		public String substring(int start):
	 * 			从指定位置截取到末尾.
	 * 		public String substring(int start,int end):
	 * 			截取从指定位置开始到指定位置结束,包括开始位置,不包括结束位置(包含头不包含尾)
	 * B:注意事项
	 * 		注意:返回值类型不再是StringBuffer本身
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("woaishiqiao");
		String str1 = sb1.substring(4);//截取从4索引开始到末尾,不改变原来的StringBuffer
		System.out.println(str1);//"shiqiao"
		
		System.out.println(sb1);//"woaishiqiao",原来的没有被改变
		
		String str2 = sb1.substring(4,7);//截取从4索引开始到7索引结束,不包含7
		System.out.println(str2);//"shi"
	}

}
