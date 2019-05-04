package com.jorge.jdk8;

public class Test29_ObjectMethodReference {

    public static void printString(Printable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s) -> {
            Test28_MethodRerObject obj = new Test28_MethodRerObject();
            obj.printUpperCaseString(s);
        });

        //方法引用
        Test28_MethodRerObject obj = new Test28_MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
