package com.qiao.ö��;

abstract public class Week3 {
	public static final Week3 MON = new Week3("����һ") {
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 TUE = new Week3("���ڶ�") {
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 WEN = new Week3("������") {
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 THU = new Week3("������") {
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 FRI = new Week3("������") {
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 SAT = new Week3("������") {
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 SUN = new Week3("������") {
		public void show() {
			System.out.println("����һ");
		}
	};
	
	private String name;
	private Week3(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
}
