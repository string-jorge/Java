package com.jorge.jdk8;

public class Test4_Calculator {
    public static void main(String[] args) {

        invokeCalc(10, 30, new Calcutator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //使用Lambda表达式
        invokeCalc(10,20,(int a,int b) ->{
            return a + b;
        });

        //优化省略Lambda表达式
        invokeCalc(10,20,(a,b) -> a + b);
    }

    public static void invokeCalc(int a,int b,Calcutator c) {
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
