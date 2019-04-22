package com.qiao.stringbuffer;

public class Test3_StringBuffer {

	/**
	 * StringBuffer的删除功能
	 * 		public StringBuffer deleteCharAt(int index):
	 * 			删除指定位置的字符,并返回本身
	 * 		public StringBuffer delete(int start,int end):
	 * 			删除从指定位置开始指定位置结束的内容,并返回本身
	 */
	public static void main(String[] args) {
		//StringBuffer的删除功能
		//删除指定位置的字符
		StringBuffer sb1 = new StringBuffer("shiqqiao");
		//sb1.deleteCharAt(10);//当缓冲区中这个索引上没有元素的时候就会报StringIndexOutOfBoundsException
		sb1.deleteCharAt(3);//删除3索引对应的字符(第四字符)
		System.out.println(sb1);//"shiqiao"
		
		//删除从指定位置开始指定位置结束的内容
		StringBuffer sb2 = new StringBuffer("shiqiaoqiao");
		sb2.delete(3, 7);//删除从3索引开始到7索引结束的字符("qiao"),包含头不包含尾
		System.out.println(sb2);//"shiqiao"
		
		//清空缓冲区
		StringBuffer sb3 = new StringBuffer("shiqiao");
		sb3.delete(0,sb3.length());// ,不包含尾,所以不是(sb3.length() - 1)
		
		/*sb1 = new StringBuffer();//不要用这种方式清空缓冲区,原来的缓冲区会变成垃圾,浪费内存
		System.out.println(sb1);*/
	}

}
