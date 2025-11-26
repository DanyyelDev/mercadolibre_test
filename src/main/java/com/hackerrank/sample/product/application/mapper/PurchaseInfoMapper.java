package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.PurchaseInfo;
import com.hackerrank.sample.product.infrastructure.entity.PurchaseInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public
interface PurchaseInfoMapper {

    @Mapping(target = "estimatedArrival", source = "estimatedArrival")
    @Mapping(target = "pickupLocation", source = "pickupLocation")
    @Mapping(target = "soldQuantity", source = "soldQuantity")
    @Mapping(target = "availableStock", source = "availableStock")
    @Mapping(target = "shippingMethod", source = "shippingMethod")
    @Mapping(target = "sellerName", source = "sellerName")
    PurchaseInfo toDomain(PurchaseInfoEntity entity);

    @Mapping(target = "estimatedArrival", source = "estimatedArrival")
    @Mapping(target = "pickupLocation", source = "pickupLocation")
    @Mapping(target = "soldQuantity", source = "soldQuantity")
    @Mapping(target = "availableStock", source = "availableStock")
    @Mapping(target = "shippingMethod", source = "shippingMethod")
    @Mapping(target = "sellerName", source = "sellerName")
    @Mapping(target = "product", ignore = true)
    PurchaseInfoEntity toEntity(PurchaseInfo domain);
}