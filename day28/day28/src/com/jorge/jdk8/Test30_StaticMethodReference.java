package com.jorge.jdk8;

public class Test30_StaticMethodReference {

    public static int method(int num,Calcable c) {
        return c.calcAbs(num);
    }

    public static void main(String[] args) {
        int number = method(-10,(n) -> {
           return Math.abs(n);
        });
        System.out.println(number);

        //使用方法引用优化Lambda表达式
        //前提是类和静态方法都是已经存在的
        int number2 = method(-20,Math::abs);

        System.out.println(number2);
    }
}
