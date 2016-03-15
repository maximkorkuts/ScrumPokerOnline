package com.scrumPoker.domain;

import com.scrumPoker.domain.dict.Entity;

/**
 * Comment entity.Use for add comment in these entities: Meeting, Issue, Task.
 * @author Maxim Korkuts
 */
public class Comment extends CommonEntity {

    /**
     * Resolve User that leave comment.
     */
    private User user;

    /**
     * Entity for what user leave his comment.
     */
    private Entity entity;

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
}
