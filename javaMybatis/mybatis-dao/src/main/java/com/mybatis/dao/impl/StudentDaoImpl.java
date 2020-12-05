package com.mybatis.dao.impl;

import com.mybatis.dao.StudentDao;
import com.mybatis.domain.Student;
import com.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectAllStudents() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.mybatis.dao.StudentDao.selectAllStudents";
        List<Student> students = sqlSession.selectList(sqlId);
        sqlSession.close();
        return students;
    }

    @Override
    public Integer insertStudent(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.mybatis.dao.StudentDao.insertStudent";
        int num = sqlSession.insert(sqlId, student);
        sqlSession.commit();
        return num;
    }

    @Override
    public Integer deleteStudent(Integer id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.mybatis.dao.StudentDao.deleteStudent";
        int num = sqlSession.insert(sqlId, id);
        sqlSession.commit();
        return num;
    }

    @Override
    public Integer updateStudent(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.mybatis.dao.StudentDao.updateStudent";
        int num = sqlSession.update(sqlId,student);
        sqlSession.commit();
        return num;
    }
}