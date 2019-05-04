package com.jorge.jdk8;

//Predicate对某种类型的数据进行判断

import java.util.function.Predicate;

public class Test10_Predicate {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abbcsdg";
        boolean b = checkString(s,(String str) -> {
            return str.length() > 5;
        });

        System.out.println(b);
    }
}
