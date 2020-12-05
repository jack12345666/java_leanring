package org.example;

import org.example.di02.Student;
import org.example.di02.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : myTest02  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-23 14:07  //时间
 */
public class myTest02 {

    @Test
    public void test01() {
        Student student = new Student();
        student.setName("jack");
        student.setAge(20);

        School school = new School();
        school.setName("清华大学");
        school.setAddress("北京");

        student.setSchool(school);

        System.out.println("Student：" + student);

    }

    @Test
    public void test02() {
        String config = "di02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        /* 从容器中获取Student对象 */
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象=" + student);
    }

}