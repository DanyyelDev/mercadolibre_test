package com.hackerrank.sample.product.infrastructure.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "purchase_info")
public class PurchaseInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estimatedArrival;
    private String pickupLocation;

    private Integer soldQuantity;
    private Integer availableStock;

    private String shippingMethod;

    private String sellerName;

    // Sales data
    @Embedded
    private SellerStatusEntity sellerStatusEntity;

    // Return info
    @Embedded
    private ReturnPolicyEntity returnPolicyEntity;

    private Boolean protectedPurchase;

    @OneToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    // Getters and setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public SellerStatusEntity getSellerStatus() {
        return sellerStatusEntity;
    }

    public void setSellerStatus(SellerStatusEntity sellerStatusEntity) {
        this.sellerStatusEntity = sellerStatusEntity;
    }

    public ReturnPolicyEntity getReturnPolicy() {
        return returnPolicyEntity;
    }

    public void setReturnPolicy(ReturnPolicyEntity returnPolicyEntity) {
        this.returnPolicyEntity = returnPolicyEntity;
    }

    public Boolean getProtectedPurchase() {
        return protectedPurchase;
    }

    public void setProtectedPurchase(Boolean protectedPurchase) {
        this.protectedPurchase = protectedPurchase;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity productEntity) {
        this.product = productEntity;
    }
}