package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.PaymentMethod;
import com.hackerrank.sample.product.infrastructure.entity.PaymentMethodEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-26T11:15:48-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class PaymentMethodMapperImpl implements PaymentMethodMapper {

    @Override
    public PaymentMethod toDomain(PaymentMethodEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String name = null;
        String type = null;

        name = entity.getType();
        type = entity.getProvider();

        boolean interestFree = true;

        PaymentMethod paymentMethod = new PaymentMethod( name, type, interestFree );

        return paymentMethod;
    }

    @Override
    public PaymentMethodEntity toEntity(PaymentMethod domain) {
        if ( domain == null ) {
            return null;
        }

        PaymentMethodEntity paymentMethodEntity = new PaymentMethodEntity();

        paymentMethodEntity.setType( domain.getName() );
        paymentMethodEntity.setProvider( domain.getType() );

        return paymentMethodEntity;
    }
}
