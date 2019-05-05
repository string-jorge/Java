package com.jorge.jdk8;

public class Test27_Methodreference {

    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        printString((s) -> {
            System.out.println(s);
        });

        //方法引用
        printString(System.out::println);
    }
}
