package com.wjw.controller;

import com.wjw.excption.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam("user") String user){
        if (user.equals("aaa")) {
            throw new UserNotExistException();
        }
        return "hello world";
    }


}
