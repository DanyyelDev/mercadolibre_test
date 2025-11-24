package com.hackerrank.sample.product.application.dto;

public class ReturnPolicyDto {
    private boolean acceptsReturns;
    private int returnDays;

    // getters y setters

    public boolean isAcceptsReturns() {
        return acceptsReturns;
    }

    public void setAcceptsReturns(boolean acceptsReturns) {
        this.acceptsReturns = acceptsReturns;
    }

    public int getReturnDays() {
        return returnDays;
    }

    public void setReturnDays(int returnDays) {
        this.returnDays = returnDays;
    }
}