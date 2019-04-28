package com.qiao.枚举;

public class Week2 {
	public static final Week2 MON = new Week2("星期一");
	public static final Week2 TUE = new Week2("星期二");
	public static final Week2 WEN = new Week2("星期三");
	public static final Week2 THU = new Week2("星期四");
	public static final Week2 FRI = new Week2("星期五");
	public static final Week2 SAT = new Week2("星期六");
	public static final Week2 SUN = new Week2("星期天");
	
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
