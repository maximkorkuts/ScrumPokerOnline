package com.scrumPoker.service.impl;

import com.scrumPoker.dao.TaskDao;
import com.scrumPoker.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author Maxim Korkuts
 */
@Service
@Validated
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

}
