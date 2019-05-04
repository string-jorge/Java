package com.jorge.jdk8;

//limit方法截取,延迟方法

import java.util.stream.Stream;

public class Test22_Stream_limit {

    public static void main(String[] args) {
        String[] arr = {"美羊羊","喜羊羊","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);

        Stream<String> stream1 = stream.limit(3);

        stream1.forEach(name -> System.out.println(name));
    }

}
