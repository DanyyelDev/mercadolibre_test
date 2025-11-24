package com.hackerrank.sample.product.infrastructure.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class ReturnPolicyEntity {

    private Boolean acceptsReturns;
    private Integer returnDays;

    // Getters and setters...

    public Boolean getAcceptsReturns() {
        return acceptsReturns;
    }

    public void setAcceptsReturns(Boolean acceptsReturns) {
        this.acceptsReturns = acceptsReturns;
    }

    public Integer getReturnDays() {
        return returnDays;
    }

    public void setReturnDays(Integer returnDays) {
        this.returnDays = returnDays;
    }
}