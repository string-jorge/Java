package com.qiao.Ã¶¾Ù;

public class Test1_Enum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//demo1();
		//demo2();
		Week3 mon = Week3.MON;
		mon.show();
	}

	private static void demo2() {
		Week2 mon = Week2.MON;
		System.out.println(mon.getName());
	}

	private static void demo1() {
		Week mon = Week.MON;
		Week sun = Week.SUN;
		
		System.out.println(mon);
	}

}
