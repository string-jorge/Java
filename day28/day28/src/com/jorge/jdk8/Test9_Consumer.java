package com.jorge.jdk8;

import java.util.function.Consumer;

public class Test9_Consumer {
    public static void printInof(String[] arr, Consumer<String> con1,Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {

        String[] arr = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男"};

        printInof(arr,(message) -> {
            String name = message.split(",")[0];
            System.out.print("姓名:" + name);
        },(message) -> {
            String age = message.split(",")[1];
            System.out.println(",年龄:" + age + ".");
        });
    }
}
