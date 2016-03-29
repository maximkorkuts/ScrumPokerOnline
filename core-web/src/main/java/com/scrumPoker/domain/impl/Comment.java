package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonEntity;
import com.scrumPoker.domain.dict.Entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Comment entity.Use for add comment in these entities: Meeting, Issue, Task.
 * @author Maxim Korkuts
 */
@javax.persistence.Entity
@Table(name = "comment")
public class Comment extends CommonEntity {

    /**
     * Resolve User that leave comment.
     */
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    /**
     * Entity for what user leave his comment.
     */
    @Enumerated(EnumType.STRING)
    private Entity entity;

    /**
     * Entity id. Resolve to what entity comment was added.
     */
    @Column(name="id_entity")
    private Long entityId;

    /**
     * Date when comment was created.
     */
    @Column(name="creation_date")
    private Date creationDate;

    /**getters and setters*/
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
