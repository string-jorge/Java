package com.qiao.collection;

import com.qiao.bean.Student;

public class Test1_Array {

	/**
	 * 把五个学生的信息存储到数组中,并遍历数组,获取到每个学生的信息
	 */
	public static void main(String[] args) {
		//int[] arr = new int[5];创建基本数据类型数组
		Student[] arr = new Student[5];//创建引用数据类型数组
		arr[0] = new Student("张三",23);//创建一个学生对象,存储在数组的第一个位置(arr[0]中存储的是学生对象的地址值,通过地址值找到学生对象实体)
		arr[1] = new Student("李四",24);//创建一个学生对象,存储在数组的第二个位置
		arr[2] = new Student("王五",25);//创建一个学生对象,存储在数组的第三个位置
		arr[3] = new Student("赵六",26);//创建一个学生对象,存储在数组的第四个位置
		arr[4] = new Student("马哥",30);//创建一个学生对象,存储在数组的第五个位置
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
