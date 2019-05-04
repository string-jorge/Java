package com.jorge.jdk8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test14_Predicate {

    public static ArrayList<String> myFilter(String[] arr, Predicate<String> pre1,Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);

            if(b) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男","赵丽颖,女"};

        ArrayList<String> list = myFilter(arr,(String s) -> {
            return s.split(",")[1].equals("女");
        },(String s) -> {
            return s.split(",")[0].length() == 4;
        });


        for (String s : list) {
            System.out.println(s);
        }

    }
}
