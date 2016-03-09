package com.scrumPoker.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value = "/", produces = {MediaType.TEXT_HTML_VALUE}
    )
    public String checkoutRedirectExample(ModelMap modelMap, HttpServletResponse response, HttpSession httpSession) throws Exception {
        return "redirect:" + "http://" + "scrumpoker" + "/login";
    }

    @RequestMapping(value = "/login", produces = {MediaType.TEXT_HTML_VALUE}
    )
    public String checkoutExample(ModelMap modelMap, HttpServletResponse response, HttpSession httpSession) throws Exception {
        return "index";
    }

}
