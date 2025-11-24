package com.hackerrank.sample.product.infrastructure.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class SellerStatusEntity {

    private String status; // e.g. "MercadoLíder Platinum"
    private Integer estimatedSales;

    // Getters and setters...

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getEstimatedSales() {
        return estimatedSales;
    }

    public void setEstimatedSales(Integer estimatedSales) {
        this.estimatedSales = estimatedSales;
    }
}

