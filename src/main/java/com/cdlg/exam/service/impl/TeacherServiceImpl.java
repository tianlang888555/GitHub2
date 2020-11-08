package com.cdlg.exam.service.impl;

import com.cdlg.exam.dao.TeacherDao;
import com.cdlg.exam.proj.Teacher;
import com.cdlg.exam.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;
    @Override
    public Teacher selectTeacher(Integer id, String pswd) {
        return teacherDao.selectTeacher(id,pswd);
    }
}
