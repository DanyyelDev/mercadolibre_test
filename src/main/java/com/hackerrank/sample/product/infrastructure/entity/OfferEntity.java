package com.hackerrank.sample.product.infrastructure.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class OfferEntity {

    private Boolean active;
    private Double discountPercentage;
    private Double discountedPrice;

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
