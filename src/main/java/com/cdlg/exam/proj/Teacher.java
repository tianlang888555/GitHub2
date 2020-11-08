package com.cdlg.exam.proj;

public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private String tpswd;
    public Teacher() {
    }
    public Teacher(Integer teacherId, String teacherName, String tpswd) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.tpswd = tpswd;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTpswd() {
        return tpswd;
    }

    public void setTpswd(String tpswd) {
        this.tpswd = tpswd;
    }
}
