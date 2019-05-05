package com.jorge.jdk8;

import java.util.Arrays;

//数组的构造器引用
public class Test34_Test {

    public static int[] createArray(int length,ArrayBuilder ab) {

        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        int[] arr1 = createArray(20,(len) -> {
            return new int[len];
        });
        System.out.println(arr1.length);

        int[] arr2 = createArray(10,int[]::new);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);
    }
}
