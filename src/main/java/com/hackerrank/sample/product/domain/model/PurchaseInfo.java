package com.hackerrank.sample.product.domain.model;

public class PurchaseInfo {
    private DeliveryInfo deliveryInfo;
    private StockInfo stockInfo;
    private SellerInfo sellerInfo;
    private ReturnPolicy returnPolicy;
    private boolean purchaseProtection;

    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public StockInfo getStockInfo() {
        return stockInfo;
    }

    public void setStockInfo(StockInfo stockInfo) {
        this.stockInfo = stockInfo;
    }

    public SellerInfo getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(SellerInfo sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public ReturnPolicy getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(ReturnPolicy returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public boolean isPurchaseProtection() {
        return purchaseProtection;
    }

    public void setPurchaseProtection(boolean purchaseProtection) {
        this.purchaseProtection = purchaseProtection;
    }
}