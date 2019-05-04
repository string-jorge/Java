package com.jorge.jdk8;

import javax.lang.model.element.NestingKind;
import java.util.function.Function;

public class Test17_Function {

    public static int change(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String s = "赵丽颖,20";

        int x = change(s,(String str) ->{
            return str.split(",")[1];
        },(String str) ->{
            return Integer.parseInt(str);
        },(Integer i) ->{
            return i + 100;
        });

        System.out.println(x);
    }
}
