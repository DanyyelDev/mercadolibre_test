package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.PaymentMethod;
import com.hackerrank.sample.product.infrastructure.entity.PaymentMethodEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public
interface PaymentMethodMapper {

    @Mapping(target = "name", source = "type")
    @Mapping(target = "type", source = "provider")
    @Mapping(target = "interestFree", constant = "true") // Valor por defecto
    PaymentMethod toDomain(PaymentMethodEntity entity);

    @Mapping(target = "type", source = "name")
    @Mapping(target = "provider", source = "type")
    @Mapping(target = "product", ignore = true)
    PaymentMethodEntity toEntity(PaymentMethod domain);
}
