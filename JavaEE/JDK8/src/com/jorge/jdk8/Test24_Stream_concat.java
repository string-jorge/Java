package com.jorge.jdk8;

import java.util.stream.Stream;

public class Test24_Stream_concat {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        String[] arr = {"美羊羊","喜羊羊","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream2 = Stream.of(arr);

        Stream<String> stream = Stream.concat(stream1, stream2);

        stream.forEach(name -> System.out.println(name));
    }
}
