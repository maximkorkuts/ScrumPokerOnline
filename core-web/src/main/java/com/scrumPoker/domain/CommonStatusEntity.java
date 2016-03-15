package com.scrumPoker.domain;

import com.scrumPoker.domain.impl.dict.EntityStatus;

/**
 * Abstract entity with status field.
 * @author Maxim Korkuts
 */
public abstract class CommonStatusEntity extends CommonEntity {

    /**
     * Entity status in current moment.
     */
    private EntityStatus status;

    /**getters and setters*/
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }
}
