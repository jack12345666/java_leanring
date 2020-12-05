package org.example;

import org.example.di01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : myTest  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-22 14:39  //时间
 */
public class myTest {
     @Test
     public void test01() {
         String config = "di01/applicationContext.xml";
         ApplicationContext ac = new ClassPathXmlApplicationContext(config);

         /* 从容器中获取Student对象 */
        Student student = (Student) ac.getBean("student");
         System.out.println("student对象=" + student);
     }
}