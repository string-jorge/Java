package com.qiao.ö��;

public class Week2 {
	public static final Week2 MON = new Week2("����һ");
	public static final Week2 TUE = new Week2("���ڶ�");
	public static final Week2 WEN = new Week2("������");
	public static final Week2 THU = new Week2("������");
	public static final Week2 FRI = new Week2("������");
	public static final Week2 SAT = new Week2("������");
	public static final Week2 SUN = new Week2("������");
	
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
