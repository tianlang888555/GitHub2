package com.cdlg.exam.conctroller;

import com.cdlg.exam.proj.Paper;
import com.cdlg.exam.proj.Student;
import com.cdlg.exam.service.PaperService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping(value = "/paper")
public class PaperController {
    @Resource
    private PaperService paperService;
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    /*添加试题*/
    public ModelAndView addPaper(Paper paper, HttpServletResponse response
                                 ) throws IOException {
        ModelAndView mv=new ModelAndView();
        int num=paperService.addPaper(paper);
        mv.addObject("sta","添加成功");
        if (num<=0){ mv.addObject("sta","添加失败");}
        mv.setViewName("forward:/jsp/addPaper.jsp");
        return mv;
    }
    @RequestMapping(value = "/stu.do")
    /*考试页面展示*/
    public ModelAndView stuPaper(){
        ModelAndView mv=new ModelAndView();
        List<Paper> papers=paperService.stuPaper();
        mv.addObject("papers",papers);
        mv.setViewName("forward:/jsp/examPaper.jsp");
        return mv;
    }
    /*教师全部试题展示*/
    @RequestMapping(value = "/allPaper")
    public ModelAndView teaPaper(){
        ModelAndView mv=new ModelAndView();
        List<Paper> papers=paperService.allPaper();
        mv.addObject("papers",papers);
        mv.setViewName("forward:/jsp/allPaper.jsp");
        return mv;
    }
    /*阅卷*/
    @RequestMapping(value = "/mark")
    public ModelAndView mark(HttpServletRequest request){
        Map<Integer,String> res =(Map<Integer,String>)request.getSession().getAttribute("res");
        Map<Integer,String> ress=new HashMap<>();
        request.getSession().removeAttribute("res");
        Set<Map.Entry<Integer,String>> ids=res.entrySet();
        for (Map.Entry<Integer,String> maps:ids
             ) {
            Integer id=maps.getKey();
            String rig=maps.getValue();
            ress.put(id,(String)request.getParameter(rig));
        }
        Student student =(Student)request.getSession().getAttribute("student");
        if (student==null){
            System.out.println("请登录！");
        }
        Integer num=paperService.judge(ress,student.getName(),student.getId());
        ModelAndView mv=new ModelAndView();
        if (num>=6){
            mv.addObject("res",
                    "您的成绩为"+num+"0分，成绩合格！");
        }else {mv.addObject("res",
                "您的成绩为"+num+"0分，成绩不合格！请继续努力！！！");}
        mv.setViewName("forward:/jsp/examResult.jsp");
        return mv;
    }
}
