package com.mybatis.dao;

import com.mybatis.domain.Student;

import java.util.List;

public interface StudentDao {
    // 查询student所有数据
    public List<Student> selectAllStudents();
    // 根据id查询学生信息
    public Student selectStudent();
    // 插入方法
    public int insertStudent(Student student);
}
