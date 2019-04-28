package com.qiao.枚举;

abstract public class Week3 {
	public static final Week3 MON = new Week3("星期一") {
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 TUE = new Week3("星期二") {
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 WEN = new Week3("星期三") {
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 THU = new Week3("星期四") {
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 FRI = new Week3("星期五") {
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 SAT = new Week3("星期六") {
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 SUN = new Week3("星期天") {
		public void show() {
			System.out.println("星期一");
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
