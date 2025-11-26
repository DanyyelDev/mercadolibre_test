package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.Offer;
import com.hackerrank.sample.product.infrastructure.entity.OfferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public
interface OfferMapper {

    // Entity → Domain: active → hasDiscount
    @Mapping(target = "hasDiscount", source = "active")
    @Mapping(target = "discountPercentage", source = "discountPercentage")
    @Mapping(target = "finalPrice", source = "discountedPrice")
    Offer toDomain(OfferEntity entity);

    // Domain → Entity: hasDiscount → active
    @Mapping(target = "active", source = "hasDiscount")
    @Mapping(target = "discountPercentage", source = "discountPercentage")
    @Mapping(target = "discountedPrice", source = "finalPrice")
    OfferEntity toEntity(Offer domain);
}