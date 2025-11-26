package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.Offer;
import com.hackerrank.sample.product.infrastructure.entity.OfferEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-26T11:15:48-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class OfferMapperImpl implements OfferMapper {

    @Override
    public Offer toDomain(OfferEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Offer offer = new Offer();

        if ( entity.getActive() != null ) {
            offer.setHasDiscount( entity.getActive() );
        }
        offer.setDiscountPercentage( entity.getDiscountPercentage() );
        offer.setFinalPrice( entity.getDiscountedPrice() );

        return offer;
    }

    @Override
    public OfferEntity toEntity(Offer domain) {
        if ( domain == null ) {
            return null;
        }

        OfferEntity offerEntity = new OfferEntity();

        offerEntity.setActive( domain.isHasDiscount() );
        offerEntity.setDiscountPercentage( domain.getDiscountPercentage() );
        offerEntity.setDiscountedPrice( domain.getFinalPrice() );

        return offerEntity;
    }
}
