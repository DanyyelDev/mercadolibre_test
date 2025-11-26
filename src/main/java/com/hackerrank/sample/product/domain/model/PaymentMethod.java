package com.hackerrank.sample.product.domain.model;

public class PaymentMethod {
    private String name;
    private String type;
    private boolean interestFree;

    public PaymentMethod(String name, String type, boolean interestFree) {
        this.name = name;
        this.type = type;
    }

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

