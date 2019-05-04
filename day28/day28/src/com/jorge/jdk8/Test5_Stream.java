package com.jorge.jdk8;

import java.util.ArrayList;

//Stream流思想

public class Test5_Stream {
    public static void main(String[] args) {

        //使用Lambda表达式进行集合遍历过滤
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("李四");
        list.add("张无忌");
        list.add("王五");

        list.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
