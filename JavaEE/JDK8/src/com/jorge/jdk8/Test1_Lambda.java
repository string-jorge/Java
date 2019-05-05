package com.jorge.jdk8;

/*
Lambda表达式:是可推导的,可以省略
    凡是根据上下文推导出来的内容,都可以省略书写
        1.(参数列表):括号中的参数列表的数据类型,可以省略不写
        2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
           3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
                注意事项:要省略({},return,分号)必须一起省略

Lambda的使用前提:
    必须有接口,接口中有且仅有一个抽象方法
    使用Lambda必须具有上下文推断
        有且仅有一个抽象方法的接口,称为函数式接口
 */

public class Test1_Lambda {
    public static void main(String[] args) {
        //原始方法
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("米西米西!");
            }
        });

        //使用lambda表达式
        invokeCook(() -> {
            System.out.println("米西米西!");
        });

        //优化省略Lambda表达式
        invokeCook( ()->System.out.println("米西米西!"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
