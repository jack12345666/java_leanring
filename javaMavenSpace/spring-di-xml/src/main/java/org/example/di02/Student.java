package org.example.di02;

/**
 * @ClassName : Student  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-23 10:31  //时间
 */
public class Student {
    private String name;
    private int age;

    // 声明一个引入类型
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setSchool：" + school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}