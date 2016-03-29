package com.scrumPoker.domain;

import com.scrumPoker.domain.dict.EntityStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

/**
 * Abstract entity with status field.
 * @author Maxim Korkuts
 */
@MappedSuperclass
public abstract class CommonStatusEntity extends CommonEntity {

    /**
     * Entity status in current moment.
     */
    @Enumerated(EnumType.STRING)
    private EntityStatus status;

    /**getters and setters*/
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }
}
