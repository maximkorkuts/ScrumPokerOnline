package com.scrumPoker.domain;

import com.scrumPoker.domain.dict.EntityStatus;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Abstract entity with status field and time fields.
 * @author Maxim Korkuts
 */
@MappedSuperclass
public abstract class CommonStatusAndTimeEntity extends CommonEntity {

    /**
     * Entity status in current moment.
     */
    @Enumerated(EnumType.STRING)
    private EntityStatus status;

    /**
     * Identify when entity created.
     */
    @Column(name="start_time")
    private Date startTime;

    /**
     * Identify when entity close(finish estimation or close).
     */
    @Column(name="end_time")
    private Date endTime;

    /**getters and setters*/
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

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
