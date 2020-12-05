package com.mybatis;

import com.mybatis.domain.Student;
import com.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {


        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        String sqlId = "com.mybatis.dao.StudentDao.selectAllStudents";

        List<Student> studentList = sqlSession.selectList(sqlId);

        studentList.forEach(stu -> System.out.println(stu));

        sqlSession.close();

    }
}