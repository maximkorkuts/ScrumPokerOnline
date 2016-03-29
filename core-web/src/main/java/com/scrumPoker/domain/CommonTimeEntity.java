package com.scrumPoker.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Abstract entity with time start and time end fields.
 * @author Maxim Korkuts
 */
@MappedSuperclass
public abstract class CommonTimeEntity extends CommonStatusEntity {

    @Column(name="start_time")
    private Date startTime;

    @Column(name="end_time")
    private Date endTime;

    /**getters and setters*/
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
