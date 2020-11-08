package com.cdlg.exam.dao;

import com.cdlg.exam.proj.Student;
import com.cdlg.exam.proj.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    int selectStudentCount(@Param("id") Integer id,@Param("spswd") String spswd);
    Student selectStudent(@Param("id") Integer id,@Param("spswd") String spswd);
    int addStudent(Student student);
    List<Student> selectStudentByTeacher(Teacher teacher);
}
