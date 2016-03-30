package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonEstimateEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity that user need to estimate.
 * Can have parent Issue, if it null, so it dependence from Meeting.
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "task")
public class Task extends CommonEstimateEntity {

    /**
     * Parent Meeting.
     */
    @ManyToOne
    @JoinColumn(name = "id_meeting")
    private Meeting meeting;

    /**
     * Parent Issue.
     * Can be null, if task attached to Meeting, not to Issue.
     */
    @ManyToOne
    @JoinColumn(name = "id_issue")
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
