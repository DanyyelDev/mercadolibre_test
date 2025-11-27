package com.hackerrank.sample.product.infrastructure.repository;

import com.hackerrank.sample.product.infrastructure.entity.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class ProductJpaRepositoryTest {

    @Autowired
    ProductJpaRepository repo;

    @Test
    void shouldSaveProduct() {
        ProductEntity p = new ProductEntity();
        p.setName("Test");
        repo.save(p);

        assertEquals(1, repo.findAll().size());
    }
}