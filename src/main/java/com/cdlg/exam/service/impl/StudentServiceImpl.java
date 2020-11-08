package com.cdlg.exam.service.impl;

import com.cdlg.exam.dao.StudentDao;
import com.cdlg.exam.proj.Student;
import com.cdlg.exam.proj.Teacher;
import com.cdlg.exam.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student loginStudent(Integer id, String pswd) {
        Student student =studentDao.selectStudent(id,pswd);
        return student;
    }

    @Override
    public boolean addStudent(Student student) {
        if (studentDao.addStudent(student)>0){
            return true;
        }
        else return false;
    }

    @Override
    public List<Student> selectStudentByTeacher(Teacher teacher) {
        List<Student> students = studentDao.selectStudentByTeacher(teacher);
        return students;
    }
}
