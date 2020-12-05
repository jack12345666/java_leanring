package com.wang;

import java.lang.annotation.*;


public class TestAnnotation {

    @MyAnnotation(age = 18)
    public void test() {

    }
}

// 定义一个注解
// Target 表示我们的注解用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// Retention 表示我们的注解在什么地方还有效
// source < class < runtime
@Retention(value = RetentionPolicy.RUNTIME)

// Documented 表示是否将我们的注解生成在javadoc中
@Documented

// Inherited 子类可以继承父类的注解
@Inherited

@interface MyAnnotation {
    // 注解的参数：参数类型 + 参数名()
    String name() default "";
    int age() default 0;
    int id() default -1; // 如果默认值为-1，代表不存在

    String[] schools() default {"清华大学", "北京大学"};

}