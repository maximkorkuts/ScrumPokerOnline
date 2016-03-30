package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonStatusAndTimeEntity;
import com.scrumPoker.domain.dict.CardBrand;

import javax.persistence.*;

/**
 * Main entity for scrum poker. User create meeting before
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "meeting")
public class Meeting extends CommonStatusAndTimeEntity {

    /**
     * URL that can give access to this meeting with Observer role.
     */
    @Column(name="url_observer")
    private String urlObserver;

    /**
     * URL that can give access to this meeting with Player role.
     */
    @Column(name="url_player")
    private String urlPlayer;

    @Enumerated(EnumType.STRING)
    @Column(name="card_brand")
    private CardBrand cardBrand;

    /**getters and setters*/
    public String getUrlPlayer() {
        return urlPlayer;
    }

    public void setUrlPlayer(String urlPlayer) {
        this.urlPlayer = urlPlayer;
    }

    public String getUrlObserver() {
        return urlObserver;
    }

    public void setUrlObserver(String urlObserver) {
        this.urlObserver = urlObserver;
    }

    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }
}
