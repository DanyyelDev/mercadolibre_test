package com.hackerrank.sample.product.application.dto;

public class ProductDetailResponse {
    private ProductDto product;
    private PurchaseInfoDto purchaseInfo;
    private QuestionsAndAnswersDto questionsAndAnswers;

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public PurchaseInfoDto getPurchaseInfo() {
        return purchaseInfo;
    }

    public void setPurchaseInfo(PurchaseInfoDto purchaseInfo) {
        this.purchaseInfo = purchaseInfo;
    }

    public QuestionsAndAnswersDto getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }

    public void setQuestionsAndAnswers(QuestionsAndAnswersDto questionsAndAnswers) {
        this.questionsAndAnswers = questionsAndAnswers;
    }
}