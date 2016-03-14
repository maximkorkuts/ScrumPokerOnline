package com.scrumPoker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for meeting entity(control list, view, edit and create pages)
 * @author Maxim Korkuts
 */
@Controller
@RequestMapping(value = "/meeting")
public class MeetingController {

    /**
     * Return main list with all meetings "meetingsPage.html"
     */
    @RequestMapping("/list")
    public String meetingListPage() throws Exception {
        return "meetingsPage";
    }
}
