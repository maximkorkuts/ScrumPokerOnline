package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonStatusEntity;

/**
 * Entity name in meeting. This entity can have a lot of tasks.
 * @author Maxim Korkuts
 */
public class Issue extends CommonStatusEntity {

    /**
     * Main meeting entity for this issue.
     * Issue can be only in one Meeting.
     */
    private Meeting meeting;

    /**getters and setters*/
    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
}
