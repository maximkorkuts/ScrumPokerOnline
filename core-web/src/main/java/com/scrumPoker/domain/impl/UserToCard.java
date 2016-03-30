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
     * User cards, that he choose. He have multiple choose.
     * User can choose several estimate task, but he could not combine card with different Card type.
     * For example, User can't combine 1 hour card and coffee card.
     * It controls by logic on UI and validators levels sides.
     */
    @ManyToOne
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