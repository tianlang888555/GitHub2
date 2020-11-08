package com.cdlg.exam.dao;

import com.cdlg.exam.proj.Paper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaperDao {
    Integer addPaper(Paper paper);
    List<Paper> allPaper();
    List<Paper> stuPaper();
    Integer judge(@Param("id") Integer paperId, @Param("rig") String right);
}
