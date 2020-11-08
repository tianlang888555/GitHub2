package com.cdlg.exam.service;

import com.cdlg.exam.proj.Score;
import com.cdlg.exam.proj.Student;

import java.util.List;

public interface ScoreService {
    List<Score> findScore(Student student);
    Integer findAvgScore(Student student);
}
