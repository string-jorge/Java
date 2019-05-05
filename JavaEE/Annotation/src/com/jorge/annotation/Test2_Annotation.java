package com.jorge.annotation;

import java.util.Date;

/**
 * JDK中预定义的一些注解
 *      @Override:检测被该注解标注的方法是否是继承父类(interface)的
 *      @Deprecated:该注解标注的内容,表示已过时
 *      @SuppressWarnings:警告压制
 */
@SuppressWarnings("all")
public class Test2_Annotation {

    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show1() {
    }

    public void show2() {
    }

    @MyAnnotation
    public void demo() {
        show1();
        Date date = new Date();
        date.getDate();
    }


}
