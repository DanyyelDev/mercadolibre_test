package com.hackerrank.sample.product.infrastructure.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "active", column = @Column(name = "offer_active")),
        @AttributeOverride(name = "discountPercentage", column = @Column(name = "offer_discount_percentage")),
        @AttributeOverride(name = "discountedPrice", column = @Column(name = "offer_discounted_price"))
})
public class OfferEntity {

    private Boolean active;
    private Double discountPercentage;
    private Double discountedPrice;

    public OfferEntity(){}


    public OfferEntity(Boolean active, Double discountPercentage, Double discountedPrice) {
        this.active = active;
        this.discountPercentage = discountPercentage;
        this.discountedPrice = discountedPrice;
    }


// Getters and setters...

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
