package com.jorge.jdk8;

//Stream里的forEach方法,依次打印数据,终结方法

import java.util.stream.Stream;

public class Test18_Stream_forEach {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三","李四","王五","赵六");
        stream.forEach(name -> System.out.println(name));
    }


}
