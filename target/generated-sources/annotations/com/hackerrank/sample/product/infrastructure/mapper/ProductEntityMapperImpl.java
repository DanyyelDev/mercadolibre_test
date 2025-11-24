package com.hackerrank.sample.product.infrastructure.mapper;

import com.hackerrank.sample.product.domain.model.Product;
import com.hackerrank.sample.product.infrastructure.entity.ProductEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-23T18:45:04-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class ProductEntityMapperImpl implements ProductEntityMapper {

    @Override
    public Product toDomain(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        return product;
    }

    @Override
    public ProductEntity toEntity(Product domain) {
        if ( domain == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        return productEntity;
    }
}
