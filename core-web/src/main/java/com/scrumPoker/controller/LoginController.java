package com.scrumPoker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for start page
 * @author Maxim Korkuts
 */
@Controller
public class LoginController {

    @Value("scrumPoker.host.name")
    private String hostName;

    /**
     * Send user to right URL "http://{hostName}/login"
     */
    @RequestMapping("/")
    public String index() throws Exception {
        return "redirect:" + "http://" + "scrumpoker" + "/login";
    }

    /**
     * Return user start page "loginPage.html"
     */
    @RequestMapping("/login")
    public String loginPage() throws Exception {
        return "loginPage";
    }

}
