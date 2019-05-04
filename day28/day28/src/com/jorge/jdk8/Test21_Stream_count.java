package com.jorge.jdk8;

/*
count 统计流元素中的个数,终结方法
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test21_Stream_count {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Stream<Integer> stream = list.stream();

        long count = stream.count();
        System.out.println(count);
    }
}
