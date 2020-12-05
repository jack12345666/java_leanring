package com.mybatis;

import com.mybatis.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {
    @Test
    public void insertStudent() throws IOException {
        // 访问mybatis读取student数据
        // 1.定义mybatis朱佩之文件的名称，从类路径的根开始（target/classes）
        String config = "mybatis.xml";
        // 2.读取这个config文件
        InputStream in = Resources.getResourceAsStream(config);
        // 3.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 4. 创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        // 5.【重要】获取SqlSession对象，从SqlSessionFactory中获取SqlSession
        SqlSession sqlSession = factory.openSession();
        // 6.【重要】指定要执行的sql语句的表示，sql映射文件中的namespace+"."+标签的id值
        String sqlId = "com.mybatis.dao.StudentDao.insertStudent";
        // 7.执行sql语句，通过sqlId找到语句
        Student student = new Student(10004, "刘备", "liubei@163.com", 29);
        int num = sqlSession.insert(sqlId, student);
        if(num == 1) {
            sqlSession.commit(); // 提交事务
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }


        // 9.关闭SqlSession对象
        sqlSession.close();
    }
}