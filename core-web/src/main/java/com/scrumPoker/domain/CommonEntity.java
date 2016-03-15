package com.scrumPoker.domain;

/**
 * Have two fields, that need for several main classes.
 * @author Maxim Korkuts
 */
public abstract class CommonEntity implements Identifiable<Long>{

    private Long id;
    /**
     * Name of entity.
     */
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

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
