package com.jorge.jdk8;

/*
JDK8新特性:Lambda表达式
    三部分组成:
        a:()
        b:->
        c:{}
    格式:
        (参数列表) -> {一些重写方法里的代码}
    解释:
        ():接口中抽象方法的参数列表,没有就空着,有参数就写出出参数,多个参数用逗号隔开
        ->:传递的意思,把参数传递给方法体
        {}:重写接口中的抽象方法的方法体
 */

public class Test2_Lambda {

    public static void main(String[] args) {
        //使用Lambda
        new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "123");
            }
        ).start();

        //优化省略Lambda表达式
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "465")).start();
    }
}
