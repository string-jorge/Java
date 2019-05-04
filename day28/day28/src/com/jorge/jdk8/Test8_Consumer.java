package com.jorge.jdk8;

//andThen方法

import java.util.function.Consumer;

public class Test8_Consumer {
    public static void method(String s, Consumer<String> con1,Consumer<String> con2) {
        //使用accept
        //con1.accept(s);
        //con2.accept(s);
        //使用andThen
        con1.andThen(con2).accept(s);               //先使用con1消费,在使用con2消费
    }

    public static void main(String[] args) {

        method("HelloWorld",
                (t) -> {
                    System.out.println(t.toUpperCase());
                },
                (t) -> {
                    System.out.println(t.toLowerCase());
                });
    }
}
