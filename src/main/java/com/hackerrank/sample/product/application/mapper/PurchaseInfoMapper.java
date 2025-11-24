package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.application.dto.*;
import com.hackerrank.sample.product.domain.model.*;

public class PurchaseInfoMapper {

    public static PurchaseInfoDto toDto(PurchaseInfo domain) {
        PurchaseInfoDto dto = new PurchaseInfoDto();

        if (domain.getDeliveryInfo() != null)
            dto.setDelivery(toDeliveryDto(domain.getDeliveryInfo()));

        if (domain.getStockInfo() != null)
            dto.setStock(toStockDto(domain.getStockInfo()));

        if (domain.getSellerInfo() != null)
            dto.setSeller(toSellerDto(domain.getSellerInfo()));

        if (domain.getReturnPolicy() != null)
            dto.setReturnPolicy(toReturnDto(domain.getReturnPolicy()));

        dto.setPurchaseProtection(domain.isPurchaseProtection());

        return dto;
    }

    private static DeliveryInfoDto toDeliveryDto(DeliveryInfo d) {
        DeliveryInfoDto dto = new DeliveryInfoDto();
        dto.setEstimatedArrival(d.getEstimatedArrival());
        dto.setPickupLocation(d.getPickupLocation());
        dto.setShippingMethod(d.getShippingMethod());
        return dto;
    }

    private static StockInfoDto toStockDto(StockInfo s) {
        StockInfoDto dto = new StockInfoDto();
        dto.setAvailableQuantity(s.getAvailableQuantity());
        dto.setSoldQuantity(s.getSoldQuantity());
        return dto;
    }

    private static SellerInfoDto toSellerDto(SellerInfo s) {
        SellerInfoDto dto = new SellerInfoDto();
        dto.setName(s.getName());
        dto.setStatus(s.getStatus());
        dto.setApproximateSales(s.getApproximateSales());
        return dto;
    }

    private static ReturnPolicyDto toReturnDto(ReturnPolicy r) {
        ReturnPolicyDto dto = new ReturnPolicyDto();
        dto.setAcceptsReturns(r.isAcceptsReturns());
        dto.setReturnDays(r.getReturnDays());
        return dto;
    }
}
