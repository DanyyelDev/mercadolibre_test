package com.hackerrank.sample.product.application.dto;

public class RatingDto {
    private double score;
    private int totalReviews;

    // getters y setters

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }
}