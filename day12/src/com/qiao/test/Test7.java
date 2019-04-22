package com.qiao.test;

public class Test7 {

	/**
	 * 需求:统计大串中小串出现的次数
	 * 这里大串小串可以自己根据情况给出
	 * 
	 * 分析:
	 * 1.定义计数器变量,变量为0;
	 * 2.通过indexOf方法在大串中找小串,
	 * 		如果没有返回-1,程序结束
	 * 		如果有返回索引值
	 * 3.根据获取的索引值加上小串长度,截取大串,将截取后的结果赋值给大串
	 * 4.回到第二步
	 * 
	 */
	public static void main(String[] args) {
		//定义大串
		String max = "woaiheima,heimabutongyubaima,wulunbaimahaishiheima,zhaodaogongzuojiushihaoma";
		//定义小串
		String min = "heima";
		
		//定义计数器变量
		int count = 0;
		//定义索引
		int index = 0;
		//定义循环
		while ((index = max.indexOf(min)) != -1) {
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}

}
