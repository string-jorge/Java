package com.jorge.jdk8;

import java.util.function.Function;

//Function接口,apply方法转换数据
public class Test15_Function {

    public static void change(String s, Function<String,Integer> fun) {
       int i = fun.apply(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        String s = "1234";

        change(s,str -> Integer.parseInt(str));
    }
}
