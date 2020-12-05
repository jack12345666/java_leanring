package com.mybatis.dao;

import com.mybatis.domain.MyStudent;
import com.mybatis.domain.Student;
import com.mybatis.vo.QueryParam;
import com.mybatis.vo.ViewStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
     Student selectStudentById(Integer id);

     List<Student> selectMultipleParam(@Param("myName") String name, @Param("myAge") Integer age);

     List<Student> selectMultipleObject(QueryParam param);

     List<Student> selectUser$Order(@Param("colName") String colName);

     List<ViewStudent> selectViewStudent();

     List<Student> selectAllStudents();

     List<MyStudent> selectAllMyStudents();

     List<Student> selectLike(String name);
}
