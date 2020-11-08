package com.cdlg.exam.proj;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private String spswd;
    private Integer age;
    private String sex;
    private String teacherName;
    private Integer teacherId;

    public Student() {
    }

    public Student(Integer id, String name, String spswd, Integer age, String sex, String teacherName, Integer teacherId) {
        this.id = id;
        this.name = name;
        this.spswd = spswd;
        this.age = age;
        this.sex = sex;
        this.teacherName = teacherName;
        this.teacherId = teacherId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpswd() {
        return spswd;
    }

    public void setSpswd(String spswd) {
        this.spswd = spswd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", spswd='" + spswd + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
