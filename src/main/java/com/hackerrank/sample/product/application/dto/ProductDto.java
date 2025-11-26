package com.hackerrank.sample.product.application.dto;

import com.hackerrank.sample.product.domain.model.PurchaseInfo;
import com.hackerrank.sample.product.domain.model.Question;

import java.util.List;

public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private double price;

    private RatingDto rating;
    private OfferDto offer;

    private List<String> productImages;
    private List<ColorOptionDto> colors;
    private List<PaymentMethodDto> paymentMethods;

    private List<String> productHighlights;
    private List<String> generalFeatures;
    private List<String> specifications;
    private List<String> additionalDetails;
    private List<String> specificTypeDetails;
    private List<QuestionDto> questions;
    private PurchaseInfoDto purchaseInfo;

    // getters y setters

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

    public RatingDto getRating() {
        return rating;
    }

    public void setRating(RatingDto rating) {
        this.rating = rating;
    }

    public OfferDto getOffer() {
        return offer;
    }

    public void setOffer(OfferDto offer) {
        this.offer = offer;
    }

    public List<String> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<String> productImages) {
        this.productImages = productImages;
    }

    public List<ColorOptionDto> getColors() {
        return colors;
    }

    public void setColors(List<ColorOptionDto> colors) {
        this.colors = colors;
    }

    public List<PaymentMethodDto> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethodDto> paymentMethods) {
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

    public List<QuestionDto> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDto> questions) {
        this.questions = questions;
    }

    public PurchaseInfoDto getPurchaseInfo() {
        return purchaseInfo;
    }

    public void setPurchaseInfo(PurchaseInfoDto purchaseInfo) {
        this.purchaseInfo = purchaseInfo;
    }
}
