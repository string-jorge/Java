package com.qiao.object;

import com.qiao.one.Student;

public class Test3_ToString {

	/**
	 * @param args
	 * com.qiao.one.Student@1963006a
	 * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    左边:类名
    中间:@
    右边:hashCode的十六进制表现形式
    这么没有什么意义
    toString方法的作用:可以更方便的显示属性值
    getXxx方法是为了获取值,可以显示也可以赋值,或者做其他操作
	 */
	public static void main(String[] args) {
		Student s = new Student("張三",23);
//		String str = s.toString();
//		System.out.println(str);
		System.out.println(s.toString());
		System.out.println(s);//如果直接打印对象引用,会默认调用toString方法
		
		System.out.println("我的姓名是:" + s.getName() + ",我的年龄是:" + s.getAge());
	}

}
