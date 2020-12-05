package com.mybatis;

import com.mybatis.dao.StudentDao;
//import com.mybatis.dao.impl.StudentDaoImpl;
import com.mybatis.domain.Student;
import com.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AppTest 
{

    @Test
    public void testSelectStudents() {
        /**
          使用mybatis的动态代理机制，使用SqlSession.getMapper(dao接口)
           getMapper能获取到dao接口对于实现类对象
         **/

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectAllStudents();
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testInsertStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student(10008, "李明", "liming@qq.com", 15);
        int num = dao.insertStudent(student);
        if(num == 1) {
            System.out.println("插入成功");
            sqlSession.commit();
        }else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void testDeleteStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        int num = dao.deleteStudent(10008);
        if(num == 1) {
            System.out.println("删除成功");
            sqlSession.commit();
        }else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void testUpdateStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student(10001, "张晓慧", "lisiming@qq.com", 38);
        int num = dao.updateStudent(student);
        if(num == 1) {
            System.out.println("更新成功");
            sqlSession.commit();
        }else {
            System.out.println("更新失败");
        }
    }


}
