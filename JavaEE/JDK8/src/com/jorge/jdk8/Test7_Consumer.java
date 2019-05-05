package com.jorge.jdk8;

//Consumer接口是消费型接口,泛型指定什么类型,使用accept方法消费(使用)什么类型的数据
//    accept方法

import java.util.function.Consumer;

public class Test7_Consumer {

    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    //消费方式,直接输出
    public static void main(String[] args) {
        method("张三",(String name) -> {
            //直接输出
            System.out.println("我的名字是:" + name);
            //反转姓名
            String rename = new StringBuilder(name).reverse().toString();
            System.out.println("反转后的名字是:" + rename);
        });
    }

}
