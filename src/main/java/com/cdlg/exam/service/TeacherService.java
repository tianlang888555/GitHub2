package com.cdlg.exam.service;

import com.cdlg.exam.proj.Teacher;
import org.springframework.stereotype.Service;


public interface TeacherService {
    Teacher selectTeacher(Integer id,String pswd);
}
