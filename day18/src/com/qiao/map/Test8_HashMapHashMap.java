package com.qiao.map;

import java.util.HashMap;

import com.qiao.bean.Student;

public class Test8_HashMapHashMap {

//集合嵌套之HashMap嵌套HashMap
	public static void main(String[] args) {
		//软件技术1701班
		HashMap<Student, String> software_one = new HashMap<>();
		software_one.put(new Student("张三",23), "渭南");
		software_one.put(new Student("李四",24), "咸阳");
		software_one.put(new Student("王五",25), "陕北");
		software_one.put(new Student("赵六",26), "汉中");
		//软件技术1702班
		HashMap<Student, String> software_two = new HashMap<>();
		software_two.put(new Student("周七",27), "西安");
		software_two.put(new Student("老六",28), "宝鸡");
		software_two.put(new Student("老王",29), "澄城");
		software_two.put(new Student("赵哥",30), "神木");
		//电子信息学院
		HashMap<HashMap<Student, String>,String> dzxx = new HashMap<>();
		dzxx.put(software_one, "软件技术1701班");
		dzxx.put(software_two, "软件技术1702班");
		//遍历双列集合
		for(HashMap<Student,String> software : dzxx.keySet()) {
			String value1 = dzxx.get(software);
			for(Student key : software.keySet()) {
				String value2 = software.get(key);
				System.out.println(key + "=" + value2 + "=" + value1);
			}
		}
	}

}
