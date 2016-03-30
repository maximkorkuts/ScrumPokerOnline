package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonIdentifyEntity;
import com.scrumPoker.domain.dict.CardBrand;
import com.scrumPoker.domain.dict.CardType;

import javax.persistence.*;

/**
 * Entity provide String name of class, estimate and to with what Brand it used.
 * Some cards can be for several brands.
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "card")
public class Card extends CommonIdentifyEntity {

    /**
     * Mark estimate in time
     */
    private Double estimate;

    /**
     * Brand of this card.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="card_brand")
    private CardBrand cardBrand;

    /**
     * Type of card. Resolve what will be on card as title.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="card_type")
    private CardType cardType;

    /**
     * Text of this card. Not null if cardType - TEXT.
     */
    private String text;

    /**
     * Card image. Resolve image as title of card. Not null if cardType - IMAGE.
     * Image save in directory of project. In DB save only path to image.
     */
    @Column(name="img_path")
    private String imagePath;

    /**getters and setters*/
    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public Double getEstimate() {
        return estimate;
    }

    public void setEstimate(Double estimate) {
        this.estimate = estimate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
