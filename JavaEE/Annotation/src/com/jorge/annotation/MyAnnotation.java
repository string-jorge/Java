package com.jorge.annotation;

/**
 * 自定义注解
 *  格式:
 *      元注解
 *      public @interface 注解名称 {
 *          属性列表;
 *      }
 *  注解的本质是接口:
 *      public interface MyAnnotation extends java.lang.annotation.Annotation {}
 *  注解的属性:接口中的抽象方法
 *      要求:
 *          1.属性的返回值类型
 *                 基本数据类型
 *                 String
 *                 枚举
 *                 注解
 *                 以上类型的数组
 *          2.定义了属性,在使用时需要给属性赋值
 *                  1.如果定义属性时,使用default关键字给属性默认初始化值,则使用注解时,可以不进行属性的赋值
 *                  2.如果只有一个属性需要赋值,并且属性的名称时value,则value可以省略,直接定义值即可
 *                  3.数组赋值时,值使用{}包裹;如果数组中只有一个值,则{}可以省略
 *  元注解:用于描述注解的注解
 *      * @target:描述注解能够作用的位置
 *      * @Retention:描述注解被保留的阶段
 *      * @Documented:描述注解是否被抽取到API文档中
 *      * @Inherited:描述注解是否被子类继承
 *
 *  在程序使用(解析)注解:获取注解中的定义的属性值
 *      1.获取注解定义的位置的对象  (Class,Method,Field)
 *      2.获取指定的注解
 *          注解定义的位置的对象.getAnnotation(注解的类型.Class)
 *      3.调用注解中的抽象方法获取配置的属性值
 *  小结:
 *      1.以后大多数时候,我们会使用注解,而不是自定义注解
 *      2.注解给谁用
 *          1.给编译器用
 *          2.给解析程序用
 *      3.注解不是程序的一部分,可以理解为注解就是一个标签
 */


public @interface MyAnnotation {

    //void show();      //不能没有返回值

    //int value();        //返回基本数据类型

    //Person per();       //返回枚举类型

    //String name() default "张三";

    //String show2();     //返回字符串类型

    //MyAnnotation2 annotation2();      //返回注解

    //String[] arr();       //返回以上类型的数组

}
