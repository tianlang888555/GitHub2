package com.cdlg.exam.dao;

import com.cdlg.exam.proj.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherDao {
    Teacher selectTeacher(@Param("id") Integer teacherId,@Param("pswd") String tpswd);

}
