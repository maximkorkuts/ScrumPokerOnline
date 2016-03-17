package com.scrumPoker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for issue entity(control list, view, edit and create pages)
 * @author Maxim Korkuts
 */
@Controller
@RequestMapping(value = "/issue")
public class IssueController {

    /**
     * Return main list with all issues "issuesPage.html"
     */
    @RequestMapping("/list")
    public String issueListPage() throws Exception {
        return "issuesPage";
    }

    /**
     * Return issue view "issuePageView.html"
     */
    @RequestMapping("/view")
    public String issueViewPage() throws Exception {
        return "issuePageView";
    }
}
