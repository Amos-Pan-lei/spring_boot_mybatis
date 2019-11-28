package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author Amos
 * Creat Time 2019 11 27
 */
@Controller
public class StuController {


    @Autowired
    private IStuService stuService;

    @RequestMapping("/a")
    @ResponseBody
    public List showStuList(Model model){
        System.out.println("qqqq");
        List<Student> list = stuService.list();
        model.addAttribute("list",list);
        return list;
    }

    @RequestMapping("/hello")
    public String hello(Model model){
        List<Student> list = stuService.list();
        model.addAttribute("list",list);
        return "index";
    }
}
