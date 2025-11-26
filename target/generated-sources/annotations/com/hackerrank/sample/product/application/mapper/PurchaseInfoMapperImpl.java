package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.PurchaseInfo;
import com.hackerrank.sample.product.infrastructure.entity.PurchaseInfoEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-26T11:15:48-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class PurchaseInfoMapperImpl implements PurchaseInfoMapper {

    @Override
    public PurchaseInfo toDomain(PurchaseInfoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String estimatedArrival = null;
        String pickupLocation = null;
        Integer soldQuantity = null;
        Integer availableStock = null;
        String shippingMethod = null;
        String sellerName = null;

        estimatedArrival = entity.getEstimatedArrival();
        pickupLocation = entity.getPickupLocation();
        soldQuantity = entity.getSoldQuantity();
        availableStock = entity.getAvailableStock();
        shippingMethod = entity.getShippingMethod();
        sellerName = entity.getSellerName();

        PurchaseInfo purchaseInfo = new PurchaseInfo( estimatedArrival, pickupLocation, soldQuantity, availableStock, shippingMethod, sellerName );

        return purchaseInfo;
    }

    @Override
    public PurchaseInfoEntity toEntity(PurchaseInfo domain) {
        if ( domain == null ) {
            return null;
        }

        PurchaseInfoEntity purchaseInfoEntity = new PurchaseInfoEntity();

        purchaseInfoEntity.setEstimatedArrival( domain.getEstimatedArrival() );
        purchaseInfoEntity.setPickupLocation( domain.getPickupLocation() );
        purchaseInfoEntity.setSoldQuantity( domain.getSoldQuantity() );
        purchaseInfoEntity.setAvailableStock( domain.getAvailableStock() );
        purchaseInfoEntity.setShippingMethod( domain.getShippingMethod() );
        purchaseInfoEntity.setSellerName( domain.getSellerName() );

        return purchaseInfoEntity;
    }
}
