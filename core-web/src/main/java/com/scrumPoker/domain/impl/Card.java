package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.dict.CardBrand;

/**
 * Entity provide String name of class, estimate and to with what Brand it used. Some cards can be for several brands.
 * @author Maxim Korkuts
 */
public class Card {

    /**
     * Card title.
     */
    private String title;

    /**
     * Mark estimate in time
     */
    private int estimate;

    /**
     * Brand of this card.
     */
    private CardBrand cardBrand;

    /**getters and setters*/
    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }
}
