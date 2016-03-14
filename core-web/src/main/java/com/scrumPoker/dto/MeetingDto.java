package com.scrumPoker.dto;

import com.scrumPoker.domain.dict.CardBrand;

/**
 * Use for create and update entity.
 * @author Maxim Korkuts
 */
public class MeetingDto {

    private String title;

    private String description;

    private CardBrand cardBrand;

    private boolean history;

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

    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public boolean isHistory() {
        return history;
    }

    public void setHistory(boolean history) {
        this.history = history;
    }
}
