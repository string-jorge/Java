package com.jorge.jdk8;

import java.util.function.Supplier;

//Supplier是生产型接口,泛型指定什么类型,就生产什么类型

public class Test6_Supplier {

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1,5,9,40,4,3,4,1,3,0};
        int x = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if(i > max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println(x);
    }
}
