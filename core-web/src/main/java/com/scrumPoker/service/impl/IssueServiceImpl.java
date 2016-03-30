package com.scrumPoker.service.impl;

import com.scrumPoker.dao.IssueDao;
import com.scrumPoker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author Maxim Korkuts
 */
@Service
@Validated
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueDao issueDao;

}
