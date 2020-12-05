package com.mybatis;

import com.mybatis.dao.StudentDao;
import com.mybatis.dao.impl.StudentDaoImpl;
import com.mybatis.domain.Student;
import org.junit.Test;

import java.util.List;

public class AppTest 
{

    @Test
    public void testSelectStudents() {
        StudentDao dao = new StudentDaoImpl();
        List<Student> studentList = dao.selectAllStudents();
        studentList.forEach(student -> System.out.println(student));
    }

    @Test
    public void testInsertStudent() {
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student(10006, "李世民", "lisiming@qq.com", 38);
        int num = dao.insertStudent(student);
        System.out.println("插入结果：" + num);
    }

    @Test
    public void testDeleteStudent() {
        StudentDao dao = new StudentDaoImpl();
        int num = dao.deleteStudent(10006);
        System.out.println("删除结果：" + num);
    }

    @Test
    public void testUpdateStudent() {
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student(10001, "李世民", "lisiming@qq.com", 38);
        int num = dao.updateStudent(student);
        System.out.println("更新结果：" + num);
    }


}
