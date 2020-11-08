package com.cdlg.exam.service.impl;

import com.cdlg.exam.dao.ScoreDao;
import com.cdlg.exam.proj.Score;
import com.cdlg.exam.proj.Student;
import com.cdlg.exam.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreDao scoreDao;
    @Override
    public List<Score> findScore(Student student) {
        return scoreDao.findScore(student);
    }

    @Override
    public Integer findAvgScore(Student student) {
        return scoreDao.findAvg(student);
    }
}
