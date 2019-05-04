package com.jorge.jdk8;

import java.util.stream.Stream;

//Stream里的filter方法过滤

public class Test19_Stream_filter {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        Stream<String> stream1 = stream.filter((String name) -> name.startsWith("张"));

        stream1.forEach(name -> System.out.println(name));
    }

}
