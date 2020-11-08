package com.cdlg.exam.conctroller;

import com.cdlg.exam.proj.Teacher;
import com.cdlg.exam.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView teacherLogin(Integer teacherId,
                                     String tpswd,
                                     HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        Teacher teacher =teacherService.selectTeacher(teacherId, tpswd);
        if (teacher==null){
            mv.addObject("loginRes","无此教师");
            mv.setViewName("forward:/jsp/teacherLogin.jsp");
        return mv;
        }
        request.getSession().setAttribute("teacher",teacher);
        mv.setViewName("teaDomain");
        return mv;
    }
}
