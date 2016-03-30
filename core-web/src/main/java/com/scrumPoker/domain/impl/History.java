package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonIdentifyEntity;
import com.scrumPoker.domain.dict.Entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Class that have information about change event.
 * @author Maxim Korkuts
 */
@javax.persistence.Entity
@Table(name = "history")
public class History extends CommonIdentifyEntity {

    /**
     * Resolve User that leave comment.
     */
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    /**
     * Time when some action was.
     */
    @Column(name="action_date")
    private Date actionDate;

    /**
     * Entity id. Resolve to what entity was some action.
     */
    @Column(name="id_entity")
    private Long entityId;

    /**
     * Entity that was changed or with what was some action
     */
    @Enumerated(EnumType.STRING)
    private Entity entity;

    /**
     * Text about what was changed
     */
    @Column(name="text_of_changes")
    private String textOfChanges;

    /**getters and setters*/
    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public String getTextOfChanges() {
        return textOfChanges;
    }

    public void setTextOfChanges(String textOfChanges) {
        this.textOfChanges = textOfChanges;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }
}
