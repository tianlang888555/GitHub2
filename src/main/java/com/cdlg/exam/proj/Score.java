package com.cdlg.exam.proj;

import java.util.Date;

/*成绩单类*/
public class Score {
    private Integer num;//成绩编号
    private Integer studentId;
    private String studentName;
    private Date date;
    private Integer grade;//分数

    public Score() {
    }

    public Score(Integer num, Integer studentId, String studentName, Date date, Integer grade) {
        this.num = num;
        this.studentId = studentId;
        this.studentName = studentName;
        this.date = date;
        this.grade = grade;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
