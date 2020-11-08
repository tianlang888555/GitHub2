package com.cdlg.exam.service;

import com.cdlg.exam.proj.Student;
import com.cdlg.exam.proj.Teacher;

import java.util.List;

public interface StudentService {
    Student loginStudent(Integer id, String pswd);
    boolean addStudent(Student student);
    List<Student> selectStudentByTeacher(Teacher teacher);
}
