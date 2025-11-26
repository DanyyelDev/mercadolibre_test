package com.hackerrank.sample.product.domain.model;

import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;

    private Rating rating;
    private Offer offer;

    private List<String> productImages;
    private List<ColorOption> colors;
    private List<PaymentMethod> paymentMethods;

    private List<String> productHighlights;
    private List<String> generalFeatures;
    private List<String> specifications;
    private List<String> additionalDetails;
    private List<String> specificTypeDetails;
    private List<Question> questions;
    private PurchaseInfo purchaseInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public List<String> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<String> productImages) {
        this.productImages = productImages;
    }

    public List<ColorOption> getColors() {
        return colors;
    }

    public void setColors(List<ColorOption> colors) {
        this.colors = colors;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public List<String> getProductHighlights() {
        return productHighlights;
    }

    public void setProductHighlights(List<String> productHighlights) {
        this.productHighlights = productHighlights;
    }

    public List<String> getGeneralFeatures() {
        return generalFeatures;
    }

    public void setGeneralFeatures(List<String> generalFeatures) {
        this.generalFeatures = generalFeatures;
    }

    public List<String> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<String> specifications) {
        this.specifications = specifications;
    }

    public List<String> getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(List<String> additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public List<String> getSpecificTypeDetails() {
        return specificTypeDetails;
    }

    public void setSpecificTypeDetails(List<String> specificTypeDetails) {
        this.specificTypeDetails = specificTypeDetails;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public PurchaseInfo getPurchaseInfo() {
        return purchaseInfo;
    }

    public void setPurchaseInfo(PurchaseInfo purchaseInfo) {
        this.purchaseInfo = purchaseInfo;
    }
}
