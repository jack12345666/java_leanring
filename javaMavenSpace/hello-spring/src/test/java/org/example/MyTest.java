package org.example;

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @ClassName : MyTest  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-22 11:17  //时间
 */
public class MyTest {
    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
    /*
     * spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中所有的对象
     * spring创建对象：默认调用的是无参构造方法
     **/

    @Test
    public void test02() {
        // 使用spring容器创建的对象
        // 1.指定spring配置文件的名称
        String config = "beans.xml";
        // 2.创建表示spring容器的对象， ApplicationContext
        // ApplicationContext就是表示Spring容器， 通过容器获取对象
        // ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext(config);

        // 从容器中获取对象，你要调用对象的方法
        // getBean("配置文件中的bean的id值")
        SomeService service = (SomeService) app.getBean("someService");

        // 使用spring创建好的对象
        service.doSome();
    }
    /**
     * 获取spring容器中 java 对象的信息
     **/
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中对象的数量：" + nums);
        // 容器中每个定义的对象的名称
        String names [] = ac.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }
    /**
     * 获取spring容器中 java 对象的信息
     **/
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 使用getBean();
        Date my = (Date) ac.getBean("myDate");
        System.out.println("Date:" + my);
    }
}