package com.cdlg.exam.conctroller;

import com.cdlg.exam.proj.Student;
import com.cdlg.exam.proj.Teacher;
import com.cdlg.exam.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public ModelAndView loginStudent(Integer id, String pswd,
                                     HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        Student student =studentService.loginStudent(id,pswd);
        if (student==null) {mv.setViewName("redirect:/jsp/studentLogin.jsp");
        return mv;
        }
        request.getSession().setAttribute("student", student);
        mv.setViewName("stuDomain");
        return mv;
    }
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public ModelAndView regStudent(Student student){
        boolean sta=studentService.addStudent(student);
        ModelAndView mv= new ModelAndView();
        if (sta){
            mv.addObject("state","注册成功");
        }
        else {mv.addObject("state","注册失败");}
        mv.setViewName("forward:/jsp/studentLogin.jsp");
        return mv;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView addStudent(Student student){
        boolean sta=studentService.addStudent(student);
        ModelAndView mv= new ModelAndView();
        if (sta){
            mv.addObject("state","注册成功");
        }
        else {mv.addObject("state","注册失败");}
        mv.setViewName("forward:/jsp/addStudent.jsp");
        return mv;
    }
    @RequestMapping(value = "/allstudent.do")
    public ModelAndView AllSelectbyTeacher(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");
        List<Student> students =studentService.selectStudentByTeacher(teacher);
        mv.addObject("students",students);
        mv.setViewName("allStudent");
        return mv;
    }
    @RequestMapping(value = "/drop")
    public ModelAndView dropout(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        request.getSession().removeAttribute("student");
        mv.setViewName("forward:/jsp/studentLogin.jsp");
        return mv;
    }
}
