package com.jorge.jdk8;

//skip方法跳过前几个元素截取

import java.util.stream.Stream;

public class Test23_Stream_skip {
    public static void main(String[] args) {

        String[] arr = {"美羊羊","喜羊羊","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);

        Stream<String> stream1 = stream.skip(3);

        stream1.forEach(name -> System.out.println(name));

    }
}
