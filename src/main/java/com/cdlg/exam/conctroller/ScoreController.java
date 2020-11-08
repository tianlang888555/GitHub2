package com.cdlg.exam.conctroller;

import com.cdlg.exam.proj.Score;
import com.cdlg.exam.proj.Student;
import com.cdlg.exam.service.ScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/score")
public class ScoreController {
    @Resource
    private ScoreService scoreService;
    @RequestMapping(value = "/stufind")
    public ModelAndView findScore(HttpServletRequest request){
        Student student=(Student)request.getSession().getAttribute("student");
        List<Score> scores =scoreService.findScore(student);
        ModelAndView mv=new ModelAndView();
        mv.addObject("avg",scoreService.findAvgScore(student));
        mv.addObject("scores",scores);
        mv.setViewName("forward:/jsp/scoreStu.jsp");
        return mv;
    }
}
