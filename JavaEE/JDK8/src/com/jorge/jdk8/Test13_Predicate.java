package com.jorge.jdk8;

//negate,去反

import java.util.function.Predicate;

public class Test13_Predicate {

    public static boolean checkString(String s, Predicate<String> pre) {
        //return !pre.test(s);
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "ssdfadf";

        boolean b = checkString(s,(String str) -> {
            return str.length() > 5;
        });

        System.out.println(b);
    }
}
