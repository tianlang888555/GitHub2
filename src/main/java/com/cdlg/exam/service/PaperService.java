package com.cdlg.exam.service;

import com.cdlg.exam.proj.Paper;

import java.util.List;
import java.util.Map;

public interface PaperService {
    Integer addPaper(Paper paper);
    List<Paper> allPaper();
    List<Paper> stuPaper();
    Integer judge(Map<Integer,String> res,String name,Integer id);
}

