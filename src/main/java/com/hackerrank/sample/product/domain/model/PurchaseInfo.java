package com.hackerrank.sample.product.domain.model;

public class PurchaseInfo {
    private String estimatedArrival;
    private String pickupLocation;

    private Integer soldQuantity;
    private Integer availableStock;

    private String shippingMethod;

    private String sellerName;

    public PurchaseInfo(String estimatedArrival, String pickupLocation, Integer soldQuantity, Integer availableStock, String shippingMethod, String sellerName) {
        this.estimatedArrival = estimatedArrival;
        this.pickupLocation = pickupLocation;
        this.soldQuantity = soldQuantity;
        this.availableStock = availableStock;
        this.shippingMethod = shippingMethod;
        this.sellerName = sellerName;
    }

    public String getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(String estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Integer getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(Integer availableStock) {
        this.availableStock = availableStock;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}