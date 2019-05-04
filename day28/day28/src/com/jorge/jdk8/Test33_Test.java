package com.jorge.jdk8;

//类的构造器引用
//使用Person类带构造方法,通过传递的姓名创建对象
public class Test33_Test {

    public static void printName(String name,StudentBuilder sb) {
        Student student = sb.BuilderStudent(name);
        System.out.println(student.getName());
    }

    public static void main(String[] args) {
        printName("迪丽热巴",(String name) -> {
            return new Student(name);
        });

        printName("古力娜扎", Student::new);
    }
}
