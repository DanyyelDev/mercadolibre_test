package com.hackerrank.sample.product.domain.model;

public class SellerInfo {
    private String name;
    private String status;
    private int approximateSales;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getApproximateSales() {
        return approximateSales;
    }

    public void setApproximateSales(int approximateSales) {
        this.approximateSales = approximateSales;
    }
}
