package com.jorge.jdk8;

/*
JDK新特性:
       接口中可以定义有方法体的方法
            非静态方法要用default修饰,静态则不用
       局部方法要使用局部变量时,前面的final可以省略
 */


public class Test0_Interface {
    public static void main(String[] args) {
        Test test = new Test();
        test.print();

        JDK8.method();

        Test t = new Test();
        t.run();

    }

}

interface JDK8 {

    public default void print() {                //非静态的方法要用default修饰
        System.out.println("Hello World");
    }

    public static void method() {
        System.out.println("static method");
    }
}

class Test implements JDK8 {

    public void run() {
        int num = 10;			                //JDK8新特性,局部方法要使用局部变量时,前面的final可以省略
        class Inner {
            public void fun() {
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.fun();
    }
}