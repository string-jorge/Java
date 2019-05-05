package com.jorge.jdk8;

import java.util.ArrayList;

//用传统方式做筛选

public class Test25_StreamTest1 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("迪丽热巴");
        list1.add("宋远桥");
        list1.add("苏星河");
        list1.add("石破天");
        list1.add("石中玉");
        list1.add("老子");
        list1.add("孔子");
        list1.add("洪七公");

        ArrayList<String> list_one = new ArrayList<>();

        for (String name : list1) {
            if(name.length() == 3) {
                list_one.add(name);
            }
        }

        ArrayList<String> list_two = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list_two.add(list_one.get(i));
        }

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("古力娜扎");
        list2.add("张无忌");
        list2.add("赵丽颖");
        list2.add("张三丰");
        list2.add("尼古拉斯赵元");
        list2.add("张二狗");
        list2.add("张天爱");

        ArrayList<String> list_1 = new ArrayList<>();
        for (String name : list2) {
            if (name.startsWith("张")) {
                list_1.add(name);
            }
        }

        ArrayList<String> list_2 = new ArrayList<>();

        for (int i = 2; i < list_1.size(); i++) {
            list_2.add(list_1.get(i));
        }

        ArrayList<String> all = new ArrayList<>();
        all.addAll(list_two);
        all.addAll(list_2);

        ArrayList<People> list = new ArrayList<>();
        for (String name : all) {
            list.add(new People(name));
        }

        for (People people : list) {
            System.out.println(people);
        }
    }
}
