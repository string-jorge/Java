package com.qiao.string;

public class Test7_StringMethod {

	/**
	 * A:String的替换功能
	 * 		String replace(char old,char new)
	 * 		String replace(String old,String new)
	 * B:String的去除字符串两端的空格
	 * 		String trim()
	 * C:String的按照字典顺序比较两个字符串
	 * 		int compareTo(String str)
	 * 		int compareToIgnoreCase(String str)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		demo3();
	}

	private static void demo3() {
		//String的按照字典顺序比较两个字符串
		
		//区分大小写
		String s1 = "abc";
		String s2 = "def";
		int num1 = s1.compareTo(s2);//-3,按照码表值比较
		System.out.println(num1);
		
		String s3 = "石";
		String s4 = "乔";
		int num2 = s3.compareTo(s4);//10655,查找的是unicode码表值
		System.out.println('石' + 0);//30707
		System.out.println('乔' + 0);//20052
		System.out.println(num2);
		
		//不区分大小写
		
		//比较:
		//区分大小写
		String s5 = "shiqiao";
		String s6 = "SHIQIAO";
		int num3 = s5.compareTo(s6);//32
		System.out.println(num3);
		
		//不区分大小写
		int num4 = s5.compareToIgnoreCase(s6);//0,相等
		System.out.println(num4);
		/*
		 * compareToIgnoreCase底层实现的方法
		 * public int compare(String s1, String s2) {
            int n1 = s1.length();//获取s1的长度
            int n2 = s2.length();//获取s2的长度
            int min = Math.min(n1, n2);//拿到长度较小的
            for (int i = 0; i < min; i++) {//遍历长度较小的的字符串
                char c1 = s1.charAt(i);//从s1里面获取第一个字符
                char c2 = s2.charAt(i);//从s2里面获取第一个字符
                if (c1 != c2) {//两个第一个字符都不想等
                    c1 = Character.toUpperCase(c1);//将c1字符转换成大写
                    c2 = Character.toUpperCase(c2);//将c2字符转换成大写
                    if (c1 != c2) {//如果还不相等
                        c1 = Character.toLowerCase(c1);//将c1字符转换成小写
                        c2 = Character.toLowerCase(c2);//将c2字符转换成小写
                        if (c1 != c2) {//如果还不相等
                            // No overflow because of numeric promotion
                            return c1 - c2;返回找对应码表值相减的结果
                        }
                    }
                }
            }
            return n1 - n2;//如果没进for循环直接返回长度相减的结果
        }
    }
		 */
	}

	private static void demo2() {
		//String的去除字符串两端的空格
		String s1 = "   shi   qiao   ";
		String s2 = s1.trim();//去除两端的空格
		System.out.println(s2);
	}

	private static void demo1() {
		//String的替换功能
		String s1 = "shiqiao";
		//替换字符
		String s2 = s1.replace('i', 'e');//用'o'替换'i'
		System.out.println(s2);
		
		String s3 = s1.replace('w', 'o');//'w'不存在,保留原字符不变
		System.out.println(s3);
		
		//替换字符串
		String s4 = s1.replace("shi","li");//用"li"替换"shi"
		System.out.println(s4);
		
		String s5 = s1.replace("zhang", "li");//"zhang"不存在,保留原字符串不变
		System.out.println(s5);
	}

}
