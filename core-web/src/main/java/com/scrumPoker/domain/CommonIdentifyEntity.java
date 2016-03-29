package com.scrumPoker.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Entity with id, type Long and it is autogenerated.
 * @author Maxim Korkuts
 */
@MappedSuperclass
public abstract class CommonIdentifyEntity implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**getters and setters*/
    @Override
    public boolean isNew() {
        return false;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
