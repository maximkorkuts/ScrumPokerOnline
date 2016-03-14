package com.scrumPoker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for task entity(control list, view, edit and create pages)
 * @author Maxim Korkuts
 */
@Controller
@RequestMapping(value = "/task")
public class TaskController {

    /**
     * Return main list with all tasks "tasksPage.html"
     */
    @RequestMapping("/list")
    public String meetingListPage() throws Exception {
        return "tasksPage";
    }
}
