package com.jihe;

import java.util.ArrayList;

class Student {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }
}

public class Demo01 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student();
        s1.setName("张三");
        s1.setSex("男");
        s1.setAge(18);
        list.add(s1);

        Student s2 = new Student();
        s2.setName("李四");
        s2.setSex("男");
        s2.setAge(20);
        list.add(s2);

        System.out.println(list);
    }
}
