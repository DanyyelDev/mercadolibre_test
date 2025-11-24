package com.hackerrank.sample.product.domain.model;

public class ReturnPolicy {
    private boolean acceptsReturns;
    private int returnDays;

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

