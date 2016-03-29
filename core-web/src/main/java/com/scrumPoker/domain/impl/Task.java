package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonTimeEntity;

/**
 * Entity that user need to estimate.
 * Can have parent Issue, if it null, so it dependence from Meeting.
 * @author Maxim Korkuts
 */
public class Task extends CommonTimeEntity {

    /**
     * Parent Meeting.
     */
    private Meeting meeting;

    /**
     * Parent Issue.
     * Can be null, if task attached to Meeting, not to Issue.
     */
    private Issue issue;

    /**getters and setters*/
    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }
}
