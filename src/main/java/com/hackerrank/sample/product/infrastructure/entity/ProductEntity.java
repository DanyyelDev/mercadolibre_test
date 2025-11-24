package com.hackerrank.sample.product.infrastructure.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    // Rating details
    @Embedded
    private RatingEntity ratingEntity;

    // Offer details
    @Embedded
    private OfferEntity offerEntity;

    private Double price;

    // Payment methods
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<PaymentMethodEntity> paymentMethodEntities;

    // Colors
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ColorOptionEntity> colors;

    // String lists
    @ElementCollection
    @CollectionTable(name = "product_highlights")
    private List<String> productHighlights;

    @ElementCollection
    @CollectionTable(name = "product_images")
    private List<String> images;

    @ElementCollection
    @CollectionTable(name = "general_features")
    private List<String> generalFeatures;

    @ElementCollection
    @CollectionTable(name = "product_specs")
    private List<String> specifications;

    @ElementCollection
    @CollectionTable(name = "other_details")
    private List<String> otherDetails;

    @ElementCollection
    @CollectionTable(name = "specific_product_data")
    private List<String> specificProductData;

    // Q&A
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<QuestionAnswerEntity> questions;

    // Purchase info
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private PurchaseInfoEntity purchaseInfoEntity;

    // Getters and setters...

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

    public RatingEntity getRatingEntity() {
        return ratingEntity;
    }

    public void setRatingEntity(RatingEntity ratingEntity) {
        this.ratingEntity = ratingEntity;
    }

    public OfferEntity getOfferEntity() {
        return offerEntity;
    }

    public void setOfferEntity(OfferEntity offerEntity) {
        this.offerEntity = offerEntity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<PaymentMethodEntity> getPaymentMethodEntities() {
        return paymentMethodEntities;
    }

    public void setPaymentMethodEntities(List<PaymentMethodEntity> paymentMethodEntities) {
        this.paymentMethodEntities = paymentMethodEntities;
    }

    public List<ColorOptionEntity> getColors() {
        return colors;
    }

    public void setColors(List<ColorOptionEntity> colors) {
        this.colors = colors;
    }

    public List<String> getProductHighlights() {
        return productHighlights;
    }

    public void setProductHighlights(List<String> productHighlights) {
        this.productHighlights = productHighlights;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
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

    public List<String> getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(List<String> otherDetails) {
        this.otherDetails = otherDetails;
    }

    public List<String> getSpecificProductData() {
        return specificProductData;
    }

    public void setSpecificProductData(List<String> specificProductData) {
        this.specificProductData = specificProductData;
    }

    public List<QuestionAnswerEntity> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionAnswerEntity> questions) {
        this.questions = questions;
    }

    public PurchaseInfoEntity getPurchaseInfoEntity() {
        return purchaseInfoEntity;
    }

    public void setPurchaseInfoEntity(PurchaseInfoEntity purchaseInfoEntity) {
        this.purchaseInfoEntity = purchaseInfoEntity;
    }
}
