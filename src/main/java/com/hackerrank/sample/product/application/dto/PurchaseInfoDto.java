package com.hackerrank.sample.product.application.dto;

public class PurchaseInfoDto {
    private String estimatedArrivalDto;
    private String pickupLocationDto;

    private Integer soldQuantityDto;
    private Integer availableStockDto;

    private String shippingMethodDto;

    private String sellerNameDto;

    // getters y setters

    public String getEstimatedArrivalDto() {
        return estimatedArrivalDto;
    }

    public void setEstimatedArrivalDto(String estimatedArrivalDto) {
        this.estimatedArrivalDto = estimatedArrivalDto;
    }

    public String getPickupLocationDto() {
        return pickupLocationDto;
    }

    public void setPickupLocationDto(String pickupLocationDto) {
        this.pickupLocationDto = pickupLocationDto;
    }

    public Integer getSoldQuantityDto() {
        return soldQuantityDto;
    }

    public void setSoldQuantityDto(Integer soldQuantityDto) {
        this.soldQuantityDto = soldQuantityDto;
    }

    public Integer getAvailableStockDto() {
        return availableStockDto;
    }

    public void setAvailableStockDto(Integer availableStockDto) {
        this.availableStockDto = availableStockDto;
    }

    public String getShippingMethodDto() {
        return shippingMethodDto;
    }

    public void setShippingMethodDto(String shippingMethodDto) {
        this.shippingMethodDto = shippingMethodDto;
    }

    public String getSellerNameDto() {
        return sellerNameDto;
    }

    public void setSellerNameDto(String sellerNameDto) {
        this.sellerNameDto = sellerNameDto;
    }
}
