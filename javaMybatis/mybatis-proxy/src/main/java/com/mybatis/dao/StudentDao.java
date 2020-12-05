package com.mybatis.dao;

import com.mybatis.domain.Student;

import java.util.List;

public interface StudentDao {
     List<Student> selectAllStudents();
     Integer insertStudent(Student student);
     Integer deleteStudent(Integer id);
     Integer updateStudent(Student student);
}
