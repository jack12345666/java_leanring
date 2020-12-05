package org.example.di01;

/**
 * @ClassName : Student  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-22 14:40  //时间
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("spring会调用 ");
    }

    public void setAge(int age) {
        this.age = age;
    }

     public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}