package com.scrumPoker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @RequestMapping("/")
    public String index() throws Exception {
        return "redirect:" + "http://" + "scrumpoker" + "/login";
    }

    @RequestMapping("/login")
    public String loginPage() throws Exception {
        return "loginPage";
    }

}
