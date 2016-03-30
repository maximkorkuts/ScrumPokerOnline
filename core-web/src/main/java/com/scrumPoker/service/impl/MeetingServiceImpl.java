package com.scrumPoker.service.impl;

import com.scrumPoker.dao.MeetingDao;
import com.scrumPoker.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author Maxim Korkuts
 */
@Service
@Validated
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingDao meetingDao;

}
