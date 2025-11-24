package com.hackerrank.sample.product.application.dto;

public class PurchaseInfoDto {
    private DeliveryInfoDto delivery;
    private StockInfoDto stock;
    private SellerInfoDto seller;
    private ReturnPolicyDto returnPolicy;

    private boolean purchaseProtection;

    // getters y setters

    public DeliveryInfoDto getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryInfoDto delivery) {
        this.delivery = delivery;
    }

    public StockInfoDto getStock() {
        return stock;
    }

    public void setStock(StockInfoDto stock) {
        this.stock = stock;
    }

    public SellerInfoDto getSeller() {
        return seller;
    }

    public void setSeller(SellerInfoDto seller) {
        this.seller = seller;
    }

    public ReturnPolicyDto getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(ReturnPolicyDto returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public boolean isPurchaseProtection() {
        return purchaseProtection;
    }

    public void setPurchaseProtection(boolean purchaseProtection) {
        this.purchaseProtection = purchaseProtection;
    }
}
