package com.hackerrank.sample.product.infrastructure.repository;

import com.hackerrank.sample.product.domain.model.Product;
import com.hackerrank.sample.product.domain.repository.ProductRepository;
import com.hackerrank.sample.product.infrastructure.entity.ProductEntity;
import com.hackerrank.sample.product.infrastructure.mapper.ProductEntityMapper;
import com.hackerrank.sample.product.infrastructure.mock.MockProductFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductJpaRepository jpaRepository;
    private final ProductEntityMapper mapper;

    public ProductRepositoryImpl(ProductJpaRepository jpaRepository,
                                 ProductEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Product findById(Long id) {
        //ProductEntity entity = jpaRepository.findById(id)
          //      .orElseThrow(() -> new RuntimeException("Product not found"));
        ProductEntity entity = MockProductFactory.createMockProduct();


        return mapper.toDomain(entity);
    }

    @Override
    public Product save(Product product) {
        ProductEntity entity = mapper.toEntity(product);
        ProductEntity saved = jpaRepository.save(entity);
        return mapper.toDomain(saved);
    }


}