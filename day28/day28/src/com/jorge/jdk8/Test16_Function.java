package com.jorge.jdk8;

//andThen方法,组合操作

import java.util.function.Function;

public class Test16_Function {

    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2) {
        String string = fun1.andThen(fun2).apply(s);
        System.out.println(string);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s,(String str) -> {
            return Integer.parseInt(str) + 10;
        },(Integer i) -> {
            return i + "";
        });
    }
}
