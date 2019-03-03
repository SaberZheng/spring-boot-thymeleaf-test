package com.example.spring_boot_thymeleaf_test.controller;

import com.example.spring_boot_thymeleaf_test.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: aimiguo
 * @Date: 2018/10/17
 * @Time: 17:12
 * Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    /*此时的路径是test ，所以会找不到路径http://localhost:8080/test/jquery-3.3.1.min.js。<script th:src="@{../jquery-3.3.1.min.js}" type="text/javascript"></script>*/
   /* @RequestMapping("/index")
    public String index(Model model){
        Person single = new Person("Amy",21);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("旋涡鸣人",12);
        Person p2 = new Person("佐助",12);
        people.add(p1);
        people.add(p2);
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return  "test";
    }*/
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("/test");
        Person single = new Person("Amy",21);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("旋涡鸣人",12);
        Person p2 = new Person("佐助",12);
        people.add(p1);
        people.add(p2);
        model.addObject("singlePerson",single);
        model.addObject("people",people);
        return model;
    }
}
