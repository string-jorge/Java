package com.jorge.jdk8;

import java.util.Arrays;
import java.util.Comparator;

public class Test3_Arrays {
    public static void main(String[] args) {

        Person[] arr = {
                new Person("张三",23),
                new Person("王五",24),
                new Person("周七",26),
                new Person("赵六",25),
  };

        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用Lambda表达式(带参数的),简化匿名内部类
        Arrays.sort(arr,(Person o1,Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //优化省略Lambda表达式
        Arrays.sort(arr,(o1,o2) -> o1.getAge() - o2.getAge());

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
