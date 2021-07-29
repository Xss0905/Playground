package com.xyh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {

    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
