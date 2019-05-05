package com.jorge.jdk8;

//创建数组的函数式接口
@FunctionalInterface
public interface ArrayBuilder {

    int[] builderArray(int length);
}
