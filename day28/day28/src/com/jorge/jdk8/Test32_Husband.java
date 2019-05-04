package com.jorge.jdk8;

//使用this引用本类的成员方法
public class Test32_Husband {

    public void buyHouse() {
        System.out.println("北京二环内买一套四合院");
    }

    public void marry(Richable r) {
        r.buy();
    }

    public void soHappy() {
        /*marry(() -> {
            this.buyHouse();
        });*/

        //使用方法引用优化Lambda表达式
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Test32_Husband().soHappy();
    }
}
