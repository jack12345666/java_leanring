package org.example;

import org.example.di03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @ClassName : myTest03  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-23 14:56  //时间
 */
public class myTest03 {
    @Test
    public void test01() {
        String config = "di03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        /* 从容器中获取Student对象 */
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);

        File myFile = (File) ac.getBean("myFile");
        System.out.println(myFile);
    }
}