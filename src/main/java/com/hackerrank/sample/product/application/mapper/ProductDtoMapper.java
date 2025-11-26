package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.application.dto.*;
import com.hackerrank.sample.product.domain.model.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductDtoMapper {

    public static ProductDto toDto(Product domain) {

        if (domain == null) return null;

        ProductDto dto = new ProductDto();

        dto.setId(domain.getId());
        dto.setName(domain.getName());
        dto.setDescription(domain.getDescription());
        dto.setPrice(domain.getPrice());

        // Rating
        if (domain.getRating() != null) {
            dto.setRating(toRatingDto(domain.getRating()));
        }

        // Offer
        if (domain.getOffer() != null) {
            dto.setOffer(toOfferDto(domain.getOffer()));
        }

        // Images
        dto.setProductImages(
                domain.getProductImages() != null ? domain.getProductImages() : List.of()
        );

        // Colors
        if (domain.getColors() != null) {
            dto.setColors(
                    domain.getColors().stream()
                            .map(ProductDtoMapper::toColorDto)
                            .collect(Collectors.toList())
            );
        } else {
            dto.setColors(List.of());
        }

        // Payment methods
        if (domain.getPaymentMethods() != null) {
            dto.setPaymentMethods(
                    domain.getPaymentMethods().stream()
                            .map(ProductDtoMapper::toPaymentDto)
                            .collect(Collectors.toList())
            );
        } else {
            dto.setPaymentMethods(List.of());
        }

        // Highlights
        dto.setProductHighlights(domain.getProductHighlights());

        // General features
        dto.setGeneralFeatures(domain.getGeneralFeatures());

        // Specifications
        dto.setSpecifications(domain.getSpecifications());

        // Additional Details
        dto.setAdditionalDetails(domain.getAdditionalDetails());

        // Specific product type details
        dto.setSpecificTypeDetails(domain.getSpecificTypeDetails());

        // Questions & answers (si tu DTO tiene este campo)
        if (domain.getQuestions() != null) {
            dto.setQuestions(
                    domain.getQuestions().stream()
                            .map(ProductDtoMapper::toQuestionAnswerDto)
                            .collect(Collectors.toList())
            );
        }

        // Purchase info (si tu DTO lo contiene)
        if (domain.getPurchaseInfo() != null) {
            dto.setPurchaseInfo(toPurchaseInfoDto(domain.getPurchaseInfo()));
        }

        return dto;
    }

    private static RatingDto toRatingDto(Rating rating) {
        RatingDto dto = new RatingDto();
        dto.setScore(rating.getAverage());
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

    private static QuestionDto toQuestionAnswerDto(Question qa) {
        QuestionDto dto = new QuestionDto();
        dto.setQuestion(qa.getQuestion());
        dto.setAnswer(qa.getAnswer());
        return dto;
    }


    private static PurchaseInfoDto toPurchaseInfoDto(PurchaseInfo pur) {
        PurchaseInfoDto dto = new PurchaseInfoDto();
        dto.setEstimatedArrivalDto(pur.getEstimatedArrival());
        dto.setPickupLocationDto(pur.getPickupLocation());
        dto.setSoldQuantityDto(pur.getSoldQuantity());
        dto.setAvailableStockDto(pur.getAvailableStock());
        dto.setShippingMethodDto(pur.getShippingMethod());
        dto.setSellerNameDto(pur.getSellerName());
        return dto;
    }

}
