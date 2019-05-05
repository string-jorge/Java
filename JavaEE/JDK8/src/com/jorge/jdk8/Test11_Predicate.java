package com.jorge.jdk8;

import java.util.function.Predicate;

//and方法

public class Test11_Predicate {

    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2) {

        //return pre1.test(s) && pre2.test(s);

        //使用and方法
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "wdgfDssfasdg";

        checkString(s,(String str) -> {
            return str.length() > 5;
        },(String str) -> {
            return str.contains("a");
        });
    }
}
