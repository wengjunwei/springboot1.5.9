package com.wjw.controller;

import com.wjw.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    @ResponseBody
    public String show(){
        return "hello world";
    }

    @RequestMapping("/person")
    @ResponseBody
    public Person person(){
        return person;
    }

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sya")
    @ResponseBody
    public String say(){
        return name;
    }
}
