package com.scrumPoker.domain.impl;


import com.scrumPoker.domain.CommonEstimateEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity name in meeting. This entity can have a lot of tasks.
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "issue")
public class Issue extends CommonEstimateEntity {

    /**
     * Main meeting entity for this issue.
     * Issue can be only in one Meeting.
     */
    @ManyToOne
    @JoinColumn(name = "id_meeting")
    private Meeting meeting;

    /**getters and setters*/
    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
}
