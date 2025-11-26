package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.Rating;
import com.hackerrank.sample.product.infrastructure.entity.RatingEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public
interface RatingMapper {

    @Mapping(target = "average", source = "average")
    @Mapping(target = "totalReviews", source = "totalReviews")
    Rating toDomain(RatingEntity entity);

    @Mapping(target = "average", source = "average")
    @Mapping(target = "totalReviews", source = "totalReviews")
    RatingEntity toEntity(Rating domain);
}
