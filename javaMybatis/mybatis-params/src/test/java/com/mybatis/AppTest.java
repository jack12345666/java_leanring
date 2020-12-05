package com.mybatis;

import com.mybatis.dao.StudentDao;
import com.mybatis.domain.MyStudent;
import com.mybatis.domain.Student;
import com.mybatis.utils.MyBatisUtils;
import com.mybatis.vo.QueryParam;
import com.mybatis.vo.ViewStudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;


public class AppTest
{

   @Test
    public void testSelectStudentById() {
       SqlSession sqlSession = MyBatisUtils.getSqlSession();
       StudentDao dao = sqlSession.getMapper(StudentDao.class);
       Student student = dao.selectStudentById(10001);
       System.out.println(student);
       sqlSession.close();
   }

   @Test
   public void testSelectMultipleParam() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Student> studentList = dao.selectMultipleParam("张飞", 15);
      studentList.forEach(student -> System.out.println(student));
      sqlSession.close();
   }

   @Test
   public void testSelectMultipleObject() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      QueryParam param = new QueryParam("李明", 22);
      List<Student> studentList = dao.selectMultipleObject(param);
      studentList.forEach(student -> System.out.println(student));
      sqlSession.close();
   }

   @Test
   public void testSelect$Order() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Student> studentList = dao.selectUser$Order("age");
      studentList.forEach(student -> System.out.println(student));
      sqlSession.close();
   }

   @Test
   public void testSelectViewStudent() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<ViewStudent>  studentList = dao.selectViewStudent();
      studentList.forEach(viewStudent -> System.out.println(viewStudent));
      sqlSession.close();
   }

   @Test
   public void testSelectAllStudents() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Student> studentList = dao.selectAllStudents();
      studentList.forEach(student -> System.out.println(student));
      sqlSession.close();
   }

   @Test
   public void testSelectAllMyStudents() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<MyStudent> studentList = dao.selectAllMyStudents();
      studentList.forEach(student -> System.out.println(student));
      sqlSession.close();
   }

   @Test
   public void testSelectLikeOne() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      StudentDao dao = sqlSession.getMapper(StudentDao.class);
      List<Student> studentList = dao.selectLike("李");
      studentList.forEach(student -> System.out.println(student));
      sqlSession.close();
   }
}
