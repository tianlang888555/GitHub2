package com.cdlg.exam.conctroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/quit")
public class QuitController {
    @RequestMapping(value = "/stu")
    public ModelAndView quitStu(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("stuDomain");
        return mv;
    }
    @RequestMapping("/tea")
    public ModelAndView quitTea(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teaDomain");
        return mv;
    }
}
