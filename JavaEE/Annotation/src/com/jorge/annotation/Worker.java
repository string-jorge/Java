package com.jorge.annotation;

@MyAnnotation(value = 23,per = Person.p1,annotation2 = @MyAnnotation2,arr = "abc")
@MyAnnotation3
public class Worker {

    @MyAnnotation3
    public String name = "a";

    @MyAnnotation3
    public void show() {

    }
}
