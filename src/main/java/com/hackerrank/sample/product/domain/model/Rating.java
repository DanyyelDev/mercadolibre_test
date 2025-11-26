package com.hackerrank.sample.product.domain.model;

public class Rating {
    private Double average;
    private Integer totalReviews;

    public Rating(){}
    public Rating(Double average, Integer totalReviews) {
        this.average = average;
        this.totalReviews = totalReviews;
    }

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
