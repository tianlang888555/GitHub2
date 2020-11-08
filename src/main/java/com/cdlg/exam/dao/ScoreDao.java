package com.cdlg.exam.dao;

import com.cdlg.exam.proj.Score;
import com.cdlg.exam.proj.Student;

import java.util.List;

public interface ScoreDao {
    Integer addScore(Score score);
    List<Score> findScore(Student student);
    Integer findAvg(Student student);
}
