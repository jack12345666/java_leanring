package org.example;

import org.example.di04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : myTest04  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-23 17:06  //时间
 */
public class myTest04 {
    @Test
    public void test01() {
        String config = "di04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        /* 从容器中获取Student对象 */
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }
}