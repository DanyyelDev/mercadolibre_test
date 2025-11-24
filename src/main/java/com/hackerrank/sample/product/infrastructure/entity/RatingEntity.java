package com.hackerrank.sample.product.infrastructure.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class RatingEntity {

    private Double average;
    private Integer totalReviews;

    // Getters and setters...

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Integer getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(Integer totalReviews) {
        this.totalReviews = totalReviews;
    }

}
