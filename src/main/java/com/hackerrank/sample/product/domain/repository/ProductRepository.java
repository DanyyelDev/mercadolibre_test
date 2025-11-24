package com.hackerrank.sample.product.domain.repository;

import com.hackerrank.sample.product.domain.model.Product;

public interface ProductRepository {

    Product findById(Long id);

    Product save(Product product);
}