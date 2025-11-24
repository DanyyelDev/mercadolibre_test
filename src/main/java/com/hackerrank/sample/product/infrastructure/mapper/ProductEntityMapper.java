package com.hackerrank.sample.product.infrastructure.mapper;

import com.hackerrank.sample.product.domain.model.Product;
import com.hackerrank.sample.product.infrastructure.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

    Product toDomain(ProductEntity entity);

    ProductEntity toEntity(Product domain);
}