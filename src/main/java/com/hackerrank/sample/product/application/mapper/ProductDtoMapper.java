package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.application.dto.*;
import com.hackerrank.sample.product.domain.model.*;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProductDtoMapper {

    public static ProductDto toDto(Product domain) {
        ProductDto dto = new ProductDto();

        dto.setId(domain.getId());
        dto.setName(domain.getName());
        dto.setDescription(domain.getDescription());
        dto.setPrice(domain.getPrice());

        if (domain.getRating() != null)
            dto.setRating(toRatingDto(domain.getRating()));

        if (domain.getOffer() != null)
            dto.setOffer(toOfferDto(domain.getOffer()));

        dto.setProductImages(domain.getProductImages());

        if (domain.getColors() != null)
            dto.setColors(domain.getColors()
                    .stream()
                    .map(ProductDtoMapper::toColorDto)
                    .collect(Collectors.toList()));

        if (domain.getPaymentMethods() != null)
            dto.setPaymentMethods(domain.getPaymentMethods()
                    .stream()
                    .map(ProductDtoMapper::toPaymentDto)
                    .collect(Collectors.toList()));

        dto.setProductHighlights(domain.getProductHighlights());
        dto.setGeneralFeatures(domain.getGeneralFeatures());
        dto.setSpecifications(domain.getSpecifications());
        dto.setAdditionalDetails(domain.getAdditionalDetails());
        dto.setSpecificTypeDetails(domain.getSpecificTypeDetails());

        return dto;
    }

    private static RatingDto toRatingDto(Rating rating) {
        RatingDto dto = new RatingDto();
        dto.setScore(rating.getScore());
        dto.setTotalReviews(rating.getTotalReviews());
        return dto;
    }

    private static OfferDto toOfferDto(Offer offer) {
        OfferDto dto = new OfferDto();
        dto.setHasDiscount(offer.isHasDiscount());
        dto.setDiscountPercentage(offer.getDiscountPercentage());
        dto.setFinalPrice(offer.getFinalPrice());
        return dto;
    }

    private static ColorOptionDto toColorDto(ColorOption color) {
        ColorOptionDto dto = new ColorOptionDto();
        dto.setName(color.getName());
        dto.setHexCode(color.getHexCode());
        dto.setImageUrl(color.getImageUrl());
        return dto;
    }

    private static PaymentMethodDto toPaymentDto(PaymentMethod p) {
        PaymentMethodDto dto = new PaymentMethodDto();
        dto.setName(p.getName());
        dto.setType(p.getType());
        dto.setInterestFree(p.isInterestFree());
        return dto;
    }
}
