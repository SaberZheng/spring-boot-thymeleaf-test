package com.example.spring_boot_thymeleaf_test;

import com.example.spring_boot_thymeleaf_test.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@SpringBootApplication
@ServletComponentScan
public class SpringBootThymeleafTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootThymeleafTestApplication.class, args);
    }

    @RequestMapping("/test")
    public String index(Model model){
        Person single = new Person("Amy",21);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("旋涡鸣人",12);
        Person p2 = new Person("佐助",12);
        people.add(p1);
        people.add(p2);
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "test";
    }


}
