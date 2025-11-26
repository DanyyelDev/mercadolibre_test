package com.hackerrank.sample.product.domain.model;

public class Offer {

    private Boolean hasDiscount;
    private Double discountPercentage;
    private Double finalPrice;

    public Offer(){}

    public Offer(Boolean hasDiscount, Double discountPercentage, Double finalPrice) {
        this.hasDiscount = hasDiscount;
        this.discountPercentage = discountPercentage;
        this.finalPrice = finalPrice;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
