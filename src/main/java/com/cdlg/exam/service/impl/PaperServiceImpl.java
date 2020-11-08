package com.cdlg.exam.service.impl;

import com.cdlg.exam.dao.PaperDao;
import com.cdlg.exam.dao.ScoreDao;
import com.cdlg.exam.proj.Paper;
import com.cdlg.exam.proj.Score;
import com.cdlg.exam.service.PaperService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@Transactional
public class PaperServiceImpl implements PaperService {
    @Resource
    private PaperDao paperDao;
    @Resource
    private ScoreDao scoreDao;
    @Override
    public Integer addPaper(Paper paper) {
        if (paper.getRa()==null||paper.getTitle()==null||paper.getRb()==null
        ||paper.getRc()==null||paper.getRd()==null||paper.getRight()==null
        ){
            return -1;
        }
        return paperDao.addPaper(paper);
    }
    @Override

    public List<Paper> allPaper() {
        return paperDao.allPaper();
    }
    @Override
    public List<Paper> stuPaper() {
        return paperDao.stuPaper();
    }

    @Override
    public Integer judge(Map<Integer, String> res,String name,Integer id) {
        Set<Map.Entry<Integer,String>> ens=res.entrySet();
        int nums=0;
        for (Map.Entry<Integer,String> re:ens
             ) {
            Integer paperid=re.getKey();
            String  rig=re.getValue();
            Integer num=paperDao.judge(paperid,rig);
            nums+=num;
        }
        Integer grade=nums*10;
        Date udate = new Date();
        Score score=new Score();
        score.setStudentName(name);
        score.setStudentId(id);
        score.setDate(udate);
        score.setGrade(grade);
        scoreDao.addScore(score);
        return nums;
    }
}
