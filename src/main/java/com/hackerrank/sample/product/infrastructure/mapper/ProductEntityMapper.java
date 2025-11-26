package com.hackerrank.sample.product.infrastructure.mapper;

import com.hackerrank.sample.product.application.mapper.*;
import com.hackerrank.sample.product.domain.model.Product;
import com.hackerrank.sample.product.infrastructure.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {
                RatingMapper.class,
                OfferMapper.class,
                ColorOptionMapper.class,
                PaymentMethodMapper.class,
                QuestionMapper.class,
                PurchaseInfoMapper.class
        },
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProductEntityMapper {

    // Entity → Domain
    @Mapping(target = "rating", source = "ratingEntity")
    @Mapping(target = "offer", source = "offerEntity")
    @Mapping(target = "colors", source = "colors")
    @Mapping(target = "paymentMethods", source = "paymentMethodEntities")
    @Mapping(target = "productImages", source = "images")
    @Mapping(target = "additionalDetails", source = "otherDetails")
    @Mapping(target = "specificTypeDetails", source = "specificProductData")
    @Mapping(target = "questions", source = "questions")
    @Mapping(target = "purchaseInfo", source = "purchaseInfoEntity")
    Product toDomain(ProductEntity entity);

    // Domain → Entity
    @Mapping(target = "ratingEntity", source = "rating")
    @Mapping(target = "offerEntity", source = "offer")
    @Mapping(target = "colors", source = "colors")
    @Mapping(target = "paymentMethodEntities", source = "paymentMethods")
    @Mapping(target = "images", source = "productImages")
    @Mapping(target = "otherDetails", source = "additionalDetails")
    @Mapping(target = "specificProductData", source = "specificTypeDetails")
    @Mapping(target = "questions", source = "questions")
    @Mapping(target = "purchaseInfoEntity", source = "purchaseInfo")
    ProductEntity toEntity(Product domain);
}