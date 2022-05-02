package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hunter")
public class HelloController {

    @RequestMapping("/user")
    @ResponseBody
    public String getReources() {
        return "hello";
    }

}
