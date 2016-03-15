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

    /**
     * Return meeting view "meetingPageView.html"
     */
    @RequestMapping("/view")
    public String meetingViewPage() throws Exception {
        return "meetingPageView";
    }
}
