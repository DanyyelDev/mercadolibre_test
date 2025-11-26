package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.Rating;
import com.hackerrank.sample.product.infrastructure.entity.RatingEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-26T11:15:48-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class RatingMapperImpl implements RatingMapper {

    @Override
    public Rating toDomain(RatingEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Rating rating = new Rating();

        rating.setAverage( entity.getAverage() );
        rating.setTotalReviews( entity.getTotalReviews() );

        return rating;
    }

    @Override
    public RatingEntity toEntity(Rating domain) {
        if ( domain == null ) {
            return null;
        }

        RatingEntity ratingEntity = new RatingEntity();

        ratingEntity.setAverage( domain.getAverage() );
        ratingEntity.setTotalReviews( domain.getTotalReviews() );

        return ratingEntity;
    }
}
