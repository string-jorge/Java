package com.jorge.jdk8;

//or方法,满足一个即可

import java.util.function.Predicate;

public class Test12_Predicate {

    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2) {
        //return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "fdc";

        boolean b = checkString(s,(String str) ->{
            return str.length() > 5;
        },(String str) -> {
            return str.contains("c");
        });

        System.out.println(b);
    }
}
