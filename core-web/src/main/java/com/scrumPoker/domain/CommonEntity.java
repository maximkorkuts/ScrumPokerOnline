package com.scrumPoker.domain;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * Have two fields, that need for several main classes.
 * @author Maxim Korkuts
 */
@MappedSuperclass
public abstract class CommonEntity extends CommonIdentifyEntity {

    /**
     * Name of entity.
     */
    @NotNull
    private String title;

    /**
     * Description/note of entity.
     */
    private String description;

    /**getters and setters*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
