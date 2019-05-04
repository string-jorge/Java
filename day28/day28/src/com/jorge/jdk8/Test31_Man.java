package com.jorge.jdk8;

//用super引用父类的成员方法
public class Test31_Man extends Human {

    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man!");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void show() {
        /*method(() -> {
            Human h = new Human();

            h.sayHello();
        });*/

        /*//因为有子父类关系,所以存在一个关键字super
        method(() -> {
            super.sayHello();
        });*/


        //用super引用父类的成员方法
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Test31_Man().show();
    }
}
