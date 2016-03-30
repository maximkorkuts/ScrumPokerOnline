package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonIdentifyEntity;

import javax.persistence.*;

/**
 * Entity that control what user voted to task(what card he had choose).
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "user_to_card")
public class UserToCard extends CommonIdentifyEntity {

    /**
     * User that voted.
     */
    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    /**
     * User card, that he choose.
     */
    @OneToOne
    @JoinColumn(name = "id_card")
    private Card card;

    /**
     * Main task for this vote.
     */
    @ManyToOne
    @JoinColumn(name = "id_task")
    private Task task;

    /**getters and setters*/
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}