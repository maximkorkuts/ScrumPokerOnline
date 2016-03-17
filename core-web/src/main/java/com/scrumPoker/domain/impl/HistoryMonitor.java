package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.dict.Entity;

import java.util.Date;

/**
 * Class that have information about change event.
 * @author Maxim Korkuts
 */
public class HistoryMonitor {

    /**
     * fullName of person, who changed
     * */
    private String changer;

    /**
     * Login of person, who changed
     */
    private String changerLogin;

    private Date changeDate;

    /**
     * code, id, login, etc.
     * */
    private String changedItemId;

    /**
     * Entity that was changed or with what was some action
     */
    private Entity entity;

    /**
     * Text about what was changed
     */
    private String textOfChanges;

    /**getters and setters*/
    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getChangedItemId() {
        return changedItemId;
    }

    public void setChangedItemId(String changedItemId) {
        this.changedItemId = changedItemId;
    }

    public String getChangerLogin() {
        return changerLogin;
    }

    public void setChangerLogin(String changerLogin) {
        this.changerLogin = changerLogin;
    }

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
}
