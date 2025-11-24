package com.hackerrank.sample.product.application.dto;

public class PaymentMethodDto {
    private String name;
    private String type;
    private boolean interestFree;

    // getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isInterestFree() {
        return interestFree;
    }

    public void setInterestFree(boolean interestFree) {
        this.interestFree = interestFree;
    }
}