package com.jorge.jdk8;

import java.util.ArrayList;
import java.util.stream.Stream;

//用传统方式做筛选

public class Test26_StreamTest2 {

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

        Stream<String> stream1 = list1.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("古力娜扎");
        list2.add("张无忌");
        list2.add("赵丽颖");
        list2.add("张三丰");
        list2.add("尼古拉斯赵元");
        list2.add("张二狗");
        list2.add("张天爱");

        Stream<String> stream2 = list2.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream.concat(stream1,stream2).map(name -> new People(name)).forEach(p -> System.out.println(p));
    }
}
